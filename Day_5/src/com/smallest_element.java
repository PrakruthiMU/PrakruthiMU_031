package com;

public class smallest_element {
public static void main(String[] args) {
	int[] arr = {10, 24, 25, 3,7};
	int small = arr[0];
	for(int i = 1; i < arr.length; i++)
	{
		if(arr[i] < small)
			small = arr[i];
		
	}
	System.out.println("Smallest number is:"+small);
}
}
