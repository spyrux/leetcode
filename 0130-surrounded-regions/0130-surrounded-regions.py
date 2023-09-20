class Solution(object):
    
    
    def solve(self, board):
        """
        :type board: List[List[str]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        self.m, self.n = len(board), len(board[0])
        
        for i in range(0, self.m):
            self.dfs(board, i, 0)
            self.dfs(board, i, self.n-1)
            
        for i in range(0, self.n):
            self.dfs(board, 0, i)
            self.dfs(board, self.m-1, i)
            
        for i,j  in product(range(self.m), range(self.n)):
            
            if board[i][j] == 'T':
                board[i][j] = 'O'
            else: board[i][j] = 'X'
            
        return board
        
        
    
    def dfs(self, board, i, j):
        
        if i < 0 or j < 0 or j >= self.n or i >= self.m or board[i][j] != 'O':
            return
        
        board[i][j] = 'T'
        
        trav_list = [[i+1,j], [i-1, j], [i, j+1], [i,j-1]]
        
        for i in trav_list:
            self.dfs( board, i[0], i[1])
        