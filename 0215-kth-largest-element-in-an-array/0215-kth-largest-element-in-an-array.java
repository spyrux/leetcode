class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int element = nums.length - k;
        int high = nums.length - 1;
        int low = 0;
        
        
        
        return qs(nums, low, high, element);
        
        
    }
    
    
    
    public void swap(int[] nums, int a, int b){
        int c = nums[b];
        nums[b] = nums[a];
        nums[a] = c;
        
        
    }
    
    public int qs(int[] nums, int l, int r, int element){
        int p = l;
        int pivot = r;
        
        for(int i = l; i < r; i++){
            if(nums[i] <= nums[pivot]){
                
                swap(nums,p,i);
                p++;
                
            }
        }
        
        swap(nums,pivot, p);
        
        if(p == element){
            return nums[p];
        }else if(p > element){
            return qs(nums, l, p-1, element);
        }else{
            return qs(nums, p+1, r, element);
        }
    }
}