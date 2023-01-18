class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }else{return -1;}
        }
        
        int high = nums.length -1;
        int low = 0;
        
        while(low <= high){
            
            int mid = high + (low-high)/2;
            
            
            if(nums[mid] == target){
                return mid;

            }else if(nums[mid] > target){
                high = mid -1;
                
            }else if(nums[mid] < target){
            
               low = mid+1;
                
            }
            
        }
        return -1;
        
        
    }
    
  
}