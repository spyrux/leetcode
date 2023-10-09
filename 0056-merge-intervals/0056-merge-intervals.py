class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        merged = []
        sortInt = intervals.sort(key = lambda x:x[0])
        s, e = intervals[0]
        
        for i in intervals[1:]:
            if i[0] > e:
                merged.append([s,e])
                s = i[0]
                e = i[1]
            else:
                e = max(i[1], e)
        
        return merged + [[s,e]]
                
        