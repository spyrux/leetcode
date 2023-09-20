
class Solution:
    
    def orangesRotting(self, grid: List[List[int]]) -> int:
        
        q = []
        visited = set()
        total = 0
        seen = 0
        #find all indices of 2 and then dfs using those indices
        minute = 0
        self.m , self.n = len(grid), len(grid[0])
        
        rotten = []
        
        for (i, j) in product(range(self.m),range(self.n)):
            if grid[i][j] == 1 or grid[i][j] == 2:
                total+=1
            if grid[i][j] == 2:
                q.append((0, i, j))

            
            
        while len(q) != 0:
            
            node = q.pop(0)
            if (node[1],node[2]) in visited or grid[node[1]][node[2]] == 0:
                continue
        
                
            visited.add((node[1],node[2]))
           
            if grid[node[1]][node[2]] == 2 or grid[node[1]][node[2]] == 1:   

                grid[node[1]][node[2]] = 2  
                seen+=1
                minute = max(minute, node[0])
            
                
                if node[1] > 0:
                    q.append((minute+1, node[1]-1, node[2]))
                if node[1] < self.m-1:
                    q.append((minute+1, node[1]+1, node[2]))
                if node[2] > 0:
                    q.append((minute+1, node[1], node[2]-1))
                if node[2] < self.n-1:
                    q.append((minute+1, node[1], node[2]+1))
              
            
  
                
                
            
        
            

                
        
        
       
        if total == seen:
            return minute
        
        else: return -1
                
            
        