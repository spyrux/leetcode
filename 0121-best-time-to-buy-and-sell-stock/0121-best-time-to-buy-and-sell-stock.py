class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currBuy = 0
        currSell = 0
        profit = 0
        for i in range(0,len(prices)):
            if prices[i] < prices[currBuy]:
                profit = max(profit, prices[currSell]-prices[currBuy])
                currBuy = i
                currSell = i
            else:
                if prices[i] > prices[currSell]:
                    currSell = i
                    profit = max(profit, prices[currSell]-prices[currBuy])
        
        return profit