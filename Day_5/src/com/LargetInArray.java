package com;

public class LargetInArray{
public static int getLarge(int arr[]) {
	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;
	
	for(int i = 0; i< arr.length;i++) {
		if(largest < arr[i])
		{
			largest = arr[i];
		}
		if(smallest > arr[i])
		{
			smallest = arr[i];
		}
	}
	System.out.println("The samllest element is:"+smallest);
	return largest;
}
public static void main(String[] args) {
	int[] arr = {1, 4, 7, 9, 3, 8};
	int largest = getLarge(arr);
	System.out.println("The  Largest element is:"+largest);
}
}
