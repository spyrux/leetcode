class Solution {
    
    public int maxProfit(int[] prices) {
        
        Integer[][] profits = new Integer[prices.length][2];
    
        
        
        
        return Math.max(dfs(prices, 0, true, profits)-prices[0], dfs(prices, 0, false, profits));
    }
    
    
    public int dfs(int[] prices, int index1, boolean bought, Integer[][] profits){
        
        if(index1 >= prices.length){
            return 0;
        }
        
        int i2 = bought? 0: 1;
        if(profits[index1][i2]!= null){
            return profits[index1][i2];
        }
        
        
        if(bought){
            int wait = dfs(prices, index1+1, true, profits);
            int sell = dfs(prices, index1+2, false, profits)+prices[index1];
            profits[index1][i2] = Math.max(wait,sell);
        }else{
            int wait = dfs(prices, index1+1, false, profits);
            int buying = dfs(prices, index1+1, true, profits)-prices[index1];
            profits[index1][i2] = Math.max(wait, buying);
        }
        
        return profits[index1][i2];
    }
    
}