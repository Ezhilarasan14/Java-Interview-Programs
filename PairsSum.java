package com.sky.pgm;

public class PairsSum {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		findPairs(arr, 7);
		findPairs(arr, 9);

	}

	private static void findPairs(int[] arr, int sum) {
		System.out.println("Pairs which make sum "+sum +" are as follows:");
		for (int i = 0; i < arr.length; i++) {
			int first = i;
			for (int j = i+1; j < arr.length; j++) {
				int second = j;
				if(first+second == sum){
					System.out.println("{ "+first+", "+second+" }");
				}
			}
		}
		
	}

}
