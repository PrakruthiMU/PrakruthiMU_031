package com;

public class sum_of_n_naturals {
public static int sum(int n) {
	if (n == 1) {
		return 1;
	}
	return n + sum(n-1);
}
public static void main(String[] args) {
	int n = 5;
	int result = sum(n);
	System.out.print("Sum of 1st "+n+" natural numbers is:"+result);
}
}
