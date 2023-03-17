class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        if(nums.length == 1){
            return nums[0]==target? 0:-1;
        }
        while(left <= right){
            int mid = left + (right-left)/2;
            
            if(target == nums[mid]){
                return mid;
                
            }else if(target > nums[mid]){
                if(target <= nums[right] || nums[left] < nums[mid]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
        
            }else{
                
                if(nums[left] <= target || nums[right] > nums[mid]){
                    right = mid - 1;
                    
                }else{
                    left = mid+1;
                }
            }

        }
        
        
        
        
        
        
        
        return -1;
    }
}