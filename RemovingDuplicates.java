package com.sky.pgm;

import java.util.Arrays;
public class RemovingDuplicates {

	public static void main(String[] args) {
		int[][] test = new int[][]{
	            {1, 1, 2, 2, 3, 4, 5},
	            {1, 1, 1, 1, 1, 1, 1},
	            {1, 2, 3, 4, 5, 6, 7},
	            {1, 2, 1, 1, 1, 1, 1},};

	        for (int[] input : test) {
	            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
	            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
	            System.out.println();
	        }
	}

	private static int[] removeDuplicates(int[] input) {
		Arrays.sort(input);
		
		int[] result = new int[input.length];
		int prev = input[0];
		result[0] = prev;
		
		for (int i = 0; i < input.length; i++) {
			int curr = input[i];
			
			if(prev != curr){
				result[i] = curr;
			}
			prev = curr;
		}
		
		return result;
	}

}
