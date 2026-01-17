package greedy;

public class maxProfit {
    public int maxProfit(int[] prices) {
        int[] profits =new int[prices.length-1];
        for(int i=0;i<prices.length-1;i++){
            profits[i]=prices[i+1]-prices[i];
        }
        int maxProfit=0;
        for(int profit: profits){
            if(profit>=0){
                maxProfit+=profit;
            }
        }
        return maxProfit;
    }
}
