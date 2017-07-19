package com.sky.pgm;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 5};
		System.out.println(getMissingNumber(arr, 5));
		
		
	}

	//To find one missing number
	public static int getMissingNumber(int[] arr, int totalCount) {
		int expectedSum = (int) (totalCount * ((float) (totalCount + 1) / 2));
		int actualSum = 0;
		
		for (int i : arr) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}
		

	

}
