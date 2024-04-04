class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        visited = [[0 for i in matrix[0]] for i in matrix]
        order = []
        dirCounter = 0
        self.spiral(dirCounter, 0, 0, order, visited, matrix)
        return order
    
    def spiral(self, dirCounter, i, j, order:List[int], visited:List[List[int]], matrix:List[List[int]]):
        if i < 0 or j < 0 or i >= len(matrix) or j >= len(matrix[0]) or visited[i][j]:
            return

        order.append(matrix[i][j])
        visited[i][j] = 1
        
        
        if dirCounter%4 == 0:
            if j+1>= len(matrix[0]) or visited[i][j+1]:
                self.spiral(dirCounter+1, i+1, j, order, visited, matrix)
            else:
                self.spiral(dirCounter, i, j+1, order, visited, matrix)
        elif dirCounter%4 == 1:
            if i+1>= len(matrix) or visited[i+1][j]:
                self.spiral(dirCounter+1, i, j-1, order, visited, matrix)
            else:
                self.spiral(dirCounter, i+1, j, order, visited, matrix)
        elif dirCounter%4 == 2:
            if j-1< 0 or visited[i][j-1]:
                self.spiral(dirCounter+1, i-1, j, order, visited, matrix)
            else:
                self.spiral(dirCounter, i, j-1, order, visited, matrix)
        else:
            if i-1< 0 or visited[i-1][j]:
                self.spiral(dirCounter+1, i, j+1, order, visited, matrix)
            else:
                self.spiral(dirCounter, i-1, j, order, visited, matrix)