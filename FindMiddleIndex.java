package com.sky.pgm;

public class FindMiddleIndex {
	
	 public static int findMiddleIndex(int[] numbers) throws Exception {
		int endIndex = numbers.length-1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;
		
		while(true){
			if(sumLeft>sumRight){
				sumRight += numbers[endIndex--];
			}else {
				sumLeft += numbers[startIndex++];
			}
			
			if(startIndex> endIndex){
				if(sumLeft == sumRight){
					break;
				}else {
					throw new Exception("Pass proper array");
				}
			}
		}
		return endIndex;
	}

	public static void main(String[] args) {
		int[] num = {2,4,4,2,5,4,3,};
		try{
			System.out.println("MiddleIndex: " + findMiddleIndex(num));
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}
