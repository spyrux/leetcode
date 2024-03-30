class Solution:
    def edgeScore(self, edges: List[int]) -> int:
        scores = {}
        for i in range(len(edges)):
            if edges[i] in scores:
                scores[edges[i]] += i
            else:
                scores[edges[i]] = i
        
        score = 0 
        edge = 0
        for key, value in scores.items():
            if value > score:
                score = value
                edge = key
            elif value == score:
                edge = min(key, edge)
        return edge