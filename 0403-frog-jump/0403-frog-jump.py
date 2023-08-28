class Solution(object):
    def canCross(self, stones):
        """
        :type stones: List[int]
        :rtype: bool
        """ 
        memo, stone_set = {}, set(stones)
        
        
            
        def dfs(index, step):
          
            if index not in stone_set or step == 0:
                return False
            
            if index == stones[-1]:
                return True
            
            if (index, step) in memo:
                return memo[index, step]
            
            memo[index, step] = dfs(index+step, step) or dfs(index+step-1, step-1) or dfs(index+step+1, step+1)
            
            return memo[index, step]
        
        return dfs(1,1)
        