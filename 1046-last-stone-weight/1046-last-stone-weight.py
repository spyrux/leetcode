from queue import PriorityQueue

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        pq = PriorityQueue()
        last = 0
        for stone in stones:
            pq.put(stone*-1)
        
        while pq.qsize() > 1:
            y = pq.get()
            x = pq.get()
            if y < x:
                pq.put(y-x)
            
        if pq.empty():

            return 0
        else:
            return pq.get()*-1
        