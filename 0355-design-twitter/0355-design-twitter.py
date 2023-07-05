class Twitter:

    def __init__(self):
        
        self.tweets = {}
        self.follows = {}
        self.count = 0

    def postTweet(self, userId: int, tweetId: int) -> None:
        
        if userId not in self.tweets:
            posts = []
            posts.append([self.count, tweetId])
            heapq.heapify(posts)
            self.tweets[userId] = posts
            self.count += 1
        else:
            posts = self.tweets[userId]
            heapq.heappush(posts, [self.count, tweetId])
            self.count += 1
        

    def getNewsFeed(self, userId: int) -> List[int]:
        heap = []

        if userId in self.tweets:
            heap.append(self.tweets[userId])

        if userId in self.follows:
            follows = self.follows[userId]

            for followId in follows:
                if followId in self.tweets:
                    heap.append(self.tweets[followId])

        heap = [h for h in heap if h is not None]  # Remove None values from heap list

        if heap:
            heap = list(heapq.merge(*heap))
            top10 = heapq.nlargest(10, heap)
            return [top[1] for top in top10]
        else:
            return []
        

    def follow(self, followerId: int, followeeId: int) -> None:
        
        if followerId not in self.follows:
            following = set()
            following.add(followeeId)
            self.follows[followerId] = following
        else:
            
            self.follows[followerId].add(followeeId)
        
        
        

    def unfollow(self, followerId: int, followeeId: int) -> None:
        
        if followerId in self.follows and followeeId in self.follows[followerId]:
            
            self.follows[followerId].remove(followeeId)
    
        
        


# Your Twitter object will be instantiated and called as such:
# obj = Twitter()
# obj.postTweet(userId,tweetId)
# param_2 = obj.getNewsFeed(userId)
# obj.follow(followerId,followeeId)
# obj.unfollow(followerId,followeeId)