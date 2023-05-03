class Solution {
    public int maxProduct(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        right[nums.length -1] = nums[nums.length-1];
        int greatest = Math.max(left[0], right[nums.length-1]);
        
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == 0){
                left[i] = nums[i];
            }else{
                left[i] = nums[i]* left[i-1];
            }
            greatest = Math.max(left[i], greatest);
        }
        
        for(int i = nums.length-2; i >= 0; i--){
           
            if(nums[i+1] == 0){
                right[i] = nums[i];
            }else{
                right[i] = nums[i]*right[i+1];
            }
            
            
            greatest = Math.max(right[i],greatest);
        }
        return greatest;
    }
}