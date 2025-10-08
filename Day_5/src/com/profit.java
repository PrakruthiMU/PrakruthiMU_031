package com;

public class profit {
public static int profit(int[] price) {
	int Buyprice = Integer.MAX_VALUE;
	int maxProfit = 0;
	for(int i = 0; i < price.length; i++) {
		if (Buyprice < price[i]) 
		{
			int profit = price[i] - Buyprice;
			maxProfit = Math.max(maxProfit, profit);
		}
		else
		{
			Buyprice = price[i];
		}
	}
	return maxProfit;
}
	public static void main(String[] args) {
		int[] price = {7, 1, 5, 3, 6, 4};
		int max = profit(price);
		System.out.println("the maximum profit is:"+max);
	}
	
}
