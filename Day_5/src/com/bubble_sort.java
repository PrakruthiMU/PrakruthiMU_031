package com;

import java.lang.reflect.Array;

public class bubble_sort {
public static void main(String[] args) 
{
	int[] arr = {5, 4, 1, 3, 2};
	System.out.println("Unsorted array:");
	for(int i = 0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	int[] array = bubbleSort(arr);
	System.out.println("Sorted array:" );
	for(int i = 0; i<array.length; i++)
	{
		System.out.print(array[i]+ " ");
	}
	System.out.println();
}

public static int[] bubbleSort(int[] arr){
	for(int i = 0; i < arr.length - 1; i++)
	{
		for(int j = 0; j < arr.length - 1 - i; j++)
		{
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}return arr;
}
}