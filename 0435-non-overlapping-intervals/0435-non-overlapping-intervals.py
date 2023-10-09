class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        
        intervals.sort(key = lambda x: ( x[1]))
        s,e = intervals[0]
        count = 0
        for i in intervals[1:]:
            if i[0] < e:
                count+=1
            else:
                s = i[0]
                e = i[1]
        
        return count
                