class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []

        visited = [[0] * len(matrix[0]) for _ in matrix]
        order = []
        self.spiral(0, 0, 0, order, visited, matrix)
        return order

    def spiral(self, dirCounter, i, j, order, visited, matrix):
        if i < 0 or j < 0 or i >= len(matrix) or j >= len(matrix[0]) or visited[i][j]:
            return

        order.append(matrix[i][j])
        visited[i][j] = 1

        if dirCounter % 4 == 0:  # Right
            if j+1 >= len(matrix[0]) or visited[i][j+1]:
                self.spiral(dirCounter+1, i+1, j, order, visited, matrix)  # Down
            else:
                self.spiral(dirCounter, i, j+1, order, visited, matrix)
        elif dirCounter % 4 == 1:  # Down
            if i+1 >= len(matrix) or visited[i+1][j]:
                self.spiral(dirCounter+1, i, j-1, order, visited, matrix)  # Left
            else:
                self.spiral(dirCounter, i+1, j, order, visited, matrix)
        elif dirCounter % 4 == 2:  # Left
            if j-1 < 0 or visited[i][j-1]:
                self.spiral(dirCounter+1, i-1, j, order, visited, matrix)  # Up
            else:
                self.spiral(dirCounter, i, j-1, order, visited, matrix)
        else:  # Up
            if i-1 < 0 or visited[i-1][j]:
                self.spiral(dirCounter+1, i, j+1, order, visited, matrix)  # Right
            else:
                self.spiral(dirCounter, i-1, j, order, visited, matrix)