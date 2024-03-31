class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        height = len(matrix)
        width = len(matrix[0])
        mid = height//2


        #flip over y axis

  
        for x in range(0, height):
            for y in range(x,width):

                    matrix[y][x], matrix[x][y] = matrix[x][y], matrix[y][x]
            matrix[x].reverse()
     