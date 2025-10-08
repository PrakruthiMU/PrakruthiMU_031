package com;

public class Sum_of_numbers {
public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	int Sum = 0;
	for(int i = 0; i<arr.length; i++) {
		Sum += arr[i];
	}
	System.out.println("Sum of array : " + Sum);
}
}
