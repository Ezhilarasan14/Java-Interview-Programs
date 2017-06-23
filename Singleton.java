package com.sky.pgm;

public class Singleton {
	
	private static Singleton myObj;
	
	static{
		myObj = new Singleton();
	}
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return myObj;
	}
	
	public void testme(){
		System.out.println("working");
	}

	public static void main(String[] args) {
		//myObj.testme();
		Singleton s = getInstance();
		s.testme();
		System.out.println(myObj.hashCode()+" "+s.hashCode());
		
	}

}
