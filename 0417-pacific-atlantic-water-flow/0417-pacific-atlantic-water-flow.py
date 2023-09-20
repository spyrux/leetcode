class Solution:
    
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        
        
        self.heights, self.m, self.n = heights, len(heights), len(heights[0])
        
        self.Apaths = [[0] * self.n for _ in range(self.m)]
        self.Ppaths = [[0] * self.n for _ in range(self.m)]
        pathlist = []
        pset = set()
        aset = set()
        
        for i in range(0, self.m):
            self.Ppaths[i][0] = 1
            self.Pdfs(i, 0, heights[i][0], pset)
            
            self.Apaths[i][self.n-1] = 1
            self.Adfs(i, self.n-1, heights[i][self.n-1], aset)
            
        for i in range(0, self.n):
            self.Ppaths[0][i] = 1
            self.Pdfs(0, i, heights[0][i], pset)
            
            self.Apaths[self.m-1][i] = 1
            self.Adfs(self.m-1, i, heights[self.m-1][i], aset)
        
            
        for i,j in product(range(self.m), range(self.n)):
            if self.Ppaths[i][j] == 1 and self.Apaths[i][j] == 1:
                pathlist.append([i,j])
            
        
        return pathlist
            
            
    
    
    def Pdfs(self, i, j, height, pset):
        
        if i < 0 or j < 0 or j >= self.n or i >= self.m or self.heights[i][j] < height or (i,j) in pset:
            return
        
        pset.add((i,j))
        trav_list = [(i+1, j), (i-1, j), (i, j+1), (i, j-1)]
        
        print("p=",i, j)
        self.Ppaths[i][j] = 1
        
        for a in trav_list:
            self.Pdfs(a[0], a[1], self.heights[i][j], pset)
            
        
        
        
    def Adfs(self, i, j, height, aset):
        
        if i < 0 or j < 0 or j >= self.n or i >= self.m or self.heights[i][j] < height or (i,j) in aset:
            return
        
        aset.add((i,j))
        trav_list = [(i+1, j), (i-1, j), (i, j+1), (i, j-1)]
        print("a=", i, j)
        self.Apaths[i][j] = 1
        
        for a in trav_list:
            self.Adfs(a[0], a[1], self.heights[i][j], aset)
            
        