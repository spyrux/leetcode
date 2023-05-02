class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        
        for(int i = 1; i <= amount; i++){
            int change = 100000;
            for(int j = 0; j < coins.length; j++){
                if(coins[j] == i){
                    change = 1;
                }else if(coins[j] < i){
                    int prev = dp[i-coins[j]];
                    if(prev == -1){
                        continue;
                    }
                    change = Math.min(change, prev+1);
                }
            }
            if(change == 100000){
                dp[i] = -1;
            }else{
                dp[i] = change;
            }
        }
        
        return dp[amount];
    }
}