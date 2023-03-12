class Solution {
    public int findMin(int[] nums) {
        int times = nums.length;
        int l = 0;
        int r = nums.length - 1;
        int min = nums[0];
        while(l <= r){
            int mid = l +(r-l)/2;
            if(nums[l] > nums[r]){
                l++;
                min = Math.min(nums[mid],min);
            }else if(nums[l] < nums[r]){
                min = Math.min(min, nums[l]);
                r = mid - 1;
            }else{
                min = Math.min(nums[mid],min);
                break;
            }
            
        }
        return min;
        
    }
}