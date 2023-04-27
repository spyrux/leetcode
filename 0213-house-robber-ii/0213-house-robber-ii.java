class Solution {
    public int rob(int[] nums) {
        
        
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] noStart = Arrays.copyOfRange(nums, 1, nums.length);
        int[] noEnd = Arrays.copyOfRange(nums, 0, nums.length -1);
        
        
        return Math.max(dp(noStart), dp(noEnd));
    }
    
    
    public int dp(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int max = nums[0];
        int[] totals = new int[nums.length];
        totals[0] = nums[0];
        totals[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
          
            if(nums[i]+totals[i-2] > totals[i-1]){
                totals[i] = nums[i]+totals[i-2];
                
            }else{
                totals[i] = totals[i-1];
            }
            
            
            
            max = Math.max(totals[i], max);
        }
        return max;        
    }
}