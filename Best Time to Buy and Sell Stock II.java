class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices == null ||prices.length<=1){
            return profit;
        }
        for(int i = 1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit = profit + prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

//############## Time Complexity: O(n) ################
//############## Space Complexity: O(1) ###############
