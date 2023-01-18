class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1){
            if(target == nums[0]){
                return 1;
            }
        }
        int left = 0;
        int right = 1;
        int sum = 0;
        int curr = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                curr = Math.min(curr, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(curr!=Integer.MAX_VALUE ){return curr;}else{return 0;}
        
    }
}