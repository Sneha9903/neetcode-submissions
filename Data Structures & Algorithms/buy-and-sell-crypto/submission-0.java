class Solution {
    public int maxProfit(int[] prices) {
        // int maxP = prices[0];
        // int minP = prices[0];
        // for (int i : prices){
        //     if (i>maxP) maxP = i;
        //     if (i<minP) minP = i;
        // }
        // int profit = maxP - minP;
        // return profit;

        int ans = 0;
        int l = prices.length;
        for (int i=0; i<l-1; i++){
            for (int j=i+1; j<l; j++){
                ans = Math.max(ans, (prices[j]-prices[i]));
            }
        }
        return ans;
    }
}
