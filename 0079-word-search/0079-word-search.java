class Solution {
    boolean exists = false;
    
    public boolean exist(char[][] board, String word) {
        int[][] seen = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                
                dfs(board, word, i, j, 0, seen);
            }
        }
        
        return exists;
    }
    
    
    
    public void dfs(char[][] board, String word, int x, int y, int index, int[][] seen){
        
        if(x > board.length - 1|| y > board[0].length - 1||x < 0|| y < 0 || seen[x][y] == 1 || board[x][y]!= word.charAt(index)){
            return;
        }
        
        
        if(index == word.length()-1){
            exists = true;
            return;
        }
           
        seen[x][y] = 1;
        dfs(board, word, x+1, y, index+1, seen);
        dfs(board, word, x, y+1, index+1, seen);
        dfs(board, word, x, y-1, index+1, seen);
        dfs(board, word, x-1, y, index+1, seen);
        seen[x][y] = 0;
        
    }
        
       
        
        
}
