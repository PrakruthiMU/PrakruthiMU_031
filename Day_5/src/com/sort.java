package com;

import java.util.Arrays;

public class sort {
public static void main(String[] args) {
	int[] arr = {7, 2, 1, 5, 4};
	Arrays.sort(arr);
	System.out.println("Sort array");
	for(int num: arr) {
		System.out.println(num + " ");
	}
	
}
}
