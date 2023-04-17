class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] total = new int[cost.length];
        total[0] = 0;
        total[1] = 0;
        for(int i = 2; i < total.length; i++){
            total[i] = Math.min(total[i-2]+cost[i-2], total[i-1]+cost[i-1]);
        }
        
        
        return Math.min(total[total.length - 1]+ cost[cost.length-1],total[total.length - 2] + cost[cost.length-2]);
    }
}