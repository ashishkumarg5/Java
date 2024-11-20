package com.practice.java;

public class BinarySearch {

	public static void main(String[] args) {
	
		int arr[] =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println(searchElement(arr, 0));
		System.out.println(searchElement(arr, 1));
		System.out.println(searchElement(arr, 2));
		System.out.println(searchElement(arr, 19));
		System.out.println(searchElement(arr, 20));
		System.out.println(searchElement(arr, 21));
		System.out.println(searchElement(arr, -1));
	}
	
	public static boolean searchElement(int[] arr, int val) {
		
		int begin = 0;
		int end = arr.length-1;
		int middle;
		int i = 0;
		
		while(begin <= end) {
			
			middle = (begin + end)/2;
			
			if(arr[middle] == val)
				return true;
			else if(arr[middle] > val) {
				end = middle - 1;
			} else {
				begin = middle + 1;
			}
		}
		
		
		return false;
	}
}
