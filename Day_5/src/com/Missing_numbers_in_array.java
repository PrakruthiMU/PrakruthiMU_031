package com;

public class Missing_numbers_in_array {
	public static void main(String[] args) {
	int[] arr = {1, 2, 4, 5, 6};
	int n =6;
	int sum = n*(n+1)/2;
	int arrSum = 0;
	
	for(int num : arr) {
		arrSum += num;
}
	System.out.println("Missing number:"+(sum-arrSum));
	}
}