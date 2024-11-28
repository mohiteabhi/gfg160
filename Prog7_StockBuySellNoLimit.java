class Prog7_StockBuySell{
	public int maximumProfit(int[] prices){
		int result = 0;
		for(int i = 1; i < prices.length; i++){
			if(prices[i-1] < prices[i]){
				result += prices[i] - prices[i - 1];
			}
		}
		return result;
	}
	public static void main(String[] args){
		int[] prices = {100, 180, 260, 310, 40, 535, 695};
		Prog7_StockBuySell stock = new Prog7_StockBuySell();
		int profit = stock.maximumProfit(prices);
		System.out.println(profit);
	}
}
