package com.practice.java;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int first = 1;
		
		int second = 1;
		
		System.out.println(first);
		System.out.println(second);
		
		for(int i=0 ; i<10 ; i++) {
			int current = first + second;
			System.out.println(first+second);
			first = second;
			second = current;
			
		}
	}

}
