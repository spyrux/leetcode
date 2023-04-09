class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]*a[0]+a[1]*a[1]-b[0]*b[0]-b[1]*b[1]);
        
        int[][] closest = new int[k][2];
        
        for(int[] point: points){
            pq.add(point);
        }
        
        int i = 0;
        while(i < k){
            
            closest[i] = pq.poll();
            i++;
        }
        
        return closest;
        
    }
}