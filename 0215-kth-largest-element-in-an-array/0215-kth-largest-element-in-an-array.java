class Solution {
    
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }
    
    public int quickSelect(int[] nums, int l, int r, int k) {

        
        int p = r;
        int pointer = l;
        
        for (int i = l; i <= r; i++) {
            if (nums[i] < nums[p]) {
                swap(nums, pointer, i);
                pointer++;
                
            }
        }
       
        swap(nums, pointer, p);
        
        if (pointer == k) {
            return nums[pointer];
        } else if (pointer > k) {
            return quickSelect(nums, l, pointer - 1, k);
        } else {
            return quickSelect(nums, pointer + 1, r, k);
        }
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}