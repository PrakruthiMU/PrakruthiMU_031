package com;

public class selection_sort {
public static void bubbleSortDescending(int arr[]) {
	int[] turn = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
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
public static int[] bubbleSort(int[] arr) {
	for(int turn=0; turn<arr.length-1; turn++) {
		for(int j=0; j<arr.length-1-turn; j++) {
			if(arr[j] < arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
}
return turn                            ;
}
