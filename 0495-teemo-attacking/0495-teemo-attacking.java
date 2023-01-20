class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //poisons for curr and curr+durr -1 
        
        //duration - (curr+1 - )
        // timseries[i-1]+poisoned[i-1] - 
        
        // 2 3
        int start = timeSeries[0];
        int end = start+duration - 1;
        int last = 0;
        
        
        for(int i = 1; i < timeSeries.length; i++){
            
            if(timeSeries[i] <= end){
                
                end = timeSeries[i] + duration-1;
                
            }else{
                last += end - start + 1;
                start = timeSeries[i];
                end = start + duration - 1;
            }
            
            
        }
        last+= end - start +1;
        
        return last;
    }
}