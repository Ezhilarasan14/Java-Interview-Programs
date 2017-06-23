package com.sky.pgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	
	public void findDuplicateChars(String str){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chrs = str.toCharArray();
		for (Character c : chrs) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		System.out.println("Letter  Count");
		for (Character ch : keys) {
			if(map.get(ch)>1){
				System.out.println("  "+ch+"        "+map.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCharsInString dcs = new DuplicateCharsInString();
		dcs.findDuplicateChars("Andamaan");
	}

}
