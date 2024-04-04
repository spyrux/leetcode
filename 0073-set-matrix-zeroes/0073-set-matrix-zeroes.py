class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        #scan matrix for zeroes then if found dfs and mark squares to be changed to 0
        # if just dfs with 0 while scanning turns everything to 0 potentially
        
        
        width = len(matrix[0])
        height = len(matrix)
        
        for i in range(0, height):
            for j in range(0, width):
                if matrix[i][j] == 0:
                    self.dfs(i-1, j ,-1, 0, matrix)
                    self.dfs(i+1, j , 1, 0, matrix)
                    self.dfs(i, j-1 , 0, -1, matrix)
                    self.dfs(i, j+1 , 0, 1, matrix)
        
        for i in range(0, height):
            for j in range(0, width):
                if matrix[i][j] == None:
                    matrix[i][j]= 0
        
    def dfs(self, i, j, x, y, matrix):
        
        if i < 0 or j < 0 or i >= len(matrix) or j >= len(matrix[0])  or matrix[i][j] == 0:
            return
        
        matrix[i][j] = None
        self.dfs(i+x, j+y , x, y, matrix)
        