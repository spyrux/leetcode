class Solution {
    public int maxSubArray(int[] nums) {
       
        
        int total = nums[0];
        int max = total;
        for(int i = 1; i < nums.length; i++){
            if(total < 0 && nums[i] > total){
                total = nums[i];
            }else{
                total += nums[i];
            }
            max = Math.max(total,max);
        }
        
        return max;
        
    }
}