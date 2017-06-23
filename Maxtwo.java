package com.sky.pgm;

public class Maxtwo {
	
	public void printTwoMaxNumber(int[] num){
		int maxOne = 0, maxTwo = 0;
		for (int i : num) {
			if(maxOne < i){
				maxTwo = maxOne;
				maxOne = i;
			}
			else if(maxTwo < i){
				maxTwo = i;
			}
		}
		System.out.println("Maximum numbers are: "+maxOne+" & "+maxTwo);
	}

	public static void main(String[] args) {
		int num[] = {5, 34, 78, 2, 45, 1, 99, 23};
		Maxtwo mx = new Maxtwo();
		mx.printTwoMaxNumber(num);

	}

}
