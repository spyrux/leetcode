class Solution {
    public boolean canJump(int[] nums) {
        // represent can get to index
        
        boolean[] able = new boolean[nums.length];
        int closestT = nums.length -1;
        able[nums.length-1] = true;
        
        for(int i = nums.length -2; i>= 0; i--){
            if(nums[i] + i >= closestT){
                able[i] = true;
                closestT = i;
            }else{
                able[i] = false;
            }
        }
        
        
        
        
        
        return able[0];
    }
}