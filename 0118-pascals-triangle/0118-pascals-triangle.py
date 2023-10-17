class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        
        rows = []
        if numRows == 1:
            return [[1]]
        rows.append([1])
        rows.append([1,1])
        print(rows)
        for i in range(2, numRows):
            nums = []
           
            
            nums.append(1)
           
                
            for j in range(1, i//2+1):
                print(j)

                nums.append(rows[i-1][j] + rows[i-1][j-1])
            
            half = nums[::-1]
            if i%2 == 0:
                half = half[1:]
            nums+= half
            print(nums)
            rows.append(nums)       
        
        return rows
                
        