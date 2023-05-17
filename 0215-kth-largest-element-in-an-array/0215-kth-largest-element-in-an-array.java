class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        List<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(list);
        
        int pop = pq.size() - k;
        
        while(pop > 0){
            pq.poll();
            pop--;
        }
        
        return pq.poll();
        
    }
}