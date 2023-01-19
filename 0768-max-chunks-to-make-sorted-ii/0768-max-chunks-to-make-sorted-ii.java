class Solution {
    public int maxChunksToSorted(int[] arr) {
        // first chunk has smallest, last has biggest
        
        int max = 0;
        int[] maxLeft = new int[arr.length];
        int[] minRight= new int[arr.length];
        maxLeft[0] = arr[0];
        minRight[arr.length-1] = arr[arr.length-1];
        
        for(int i = 1; i < arr.length; i++){
            maxLeft[i]= Math.max(maxLeft[i-1], arr[i]);
        }
        
        for(int i = arr.length-2; i>= 0; i--){
            minRight[i]= Math.min(minRight[i+1], arr[i]);
        }
        
        for(int i = 0; i < arr.length -1;i++){
            if(maxLeft[i]<=minRight[i+1]){
                max++;
            }
        }
        
        
        
        // sort first chunk if the last element is bigger than first element in sorted second chunk it is not viable
        // 
        return max + 1;
        
        
    }
    
    
    
    
}