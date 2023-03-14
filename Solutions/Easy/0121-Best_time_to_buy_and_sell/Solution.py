class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy=prices[0]
        maxProfit=0
        for i in range(1,len(prices)):
            if prices[i]-buy>maxProfit:
                maxProfit=prices[i]-buy
            if prices[i]<buy:
                buy=prices[i]
        return maxProfit