class Solution {
    public int largestRectangleArea(int[] heights) {
        // if it is smaller then add to the stack and the rectangle is top of stack * szie of stack
        // add to stack if it is bigger from the left 
        // stack if rect at curr greater than the built rectangle restart the stack with curr 
        // add to stack if built with index >= prevbuilt
        // keep track of max rectangle at each index subsequent rectangles are made with adding the min of curr and top of stack to the prev
        
        Stack<int[]> minHeight = new Stack<>();
        int[] first = {0, heights[0]};
        int greatest = heights[0];
        minHeight.push(first);
        for(int i = 1; i < heights.length; i++){
            // 0,2
            int start = i;
            while(!minHeight.isEmpty() && minHeight.peek()[1] > heights[i]){
                int[] popped = minHeight.pop();
                int area = (i - popped[0])*popped[1];
                greatest = Math.max(greatest,area);
                start = popped[0];
            }
            
            int[] curr = {start, heights[i]};
            minHeight.push(curr);
            
        }
        
        while(!minHeight.isEmpty()){
            int[] popped = minHeight.pop();
            int area = ((heights.length) - popped[0])*popped[1];
            System.out.println(area);
            greatest = Math.max(greatest,area);
        }
        
        
        return greatest;
        
    }
    
    
}