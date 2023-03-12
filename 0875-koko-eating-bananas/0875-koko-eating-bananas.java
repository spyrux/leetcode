class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // add piles up then divide by h and pick the 
        // if pileslength is = h have to eat at speed of biggest pile
        // 
        
        
      
        Arrays.sort(piles);
        int pilemax = piles[piles.length - 1];
        int k = pilemax;
        
       
        
        int l = 0;
        int r = pilemax;
        
        
        while(l <= r){
            int mid = r + (l-r)/2;
            int total = 0;
            for(int i = 0; i < piles.length; i++){
                total += Math.ceil((double)piles[i]/mid);
            }
            if(total > h){
                l = mid + 1;
            }else if(total <= h){
                k = Math.min(mid, k);
                r = mid - 1;
            }
            
            
        }
        
        
        
        return k;
        
    }
}