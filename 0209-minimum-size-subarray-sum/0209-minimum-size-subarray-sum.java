class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1){
            if(target == nums[0]){
                return 1;
            }
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int curr = Integer.MAX_VALUE;
        while(right < nums.length){
            sum += nums[right];
            
            while(sum >= target){
                curr = Math.min(curr, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if(curr!=Integer.MAX_VALUE ){return curr;}else{return 0;}
        
    }
}