package hackerearth;

import org.apache.commons.lang.StringUtils;

public class SnaketoCamelCase {

	public static void main(String[] args) {
		String input = "camel_case_str_test";
		System.out.println(convert(input));
		System.out.println(ApacheUtilsMethod(input));

	}
	
	public static String convert(String inputStr){
		StringBuilder strBuilder = new StringBuilder(inputStr.length());
		boolean capitalizeNextChar = false;
		
		for (char c : inputStr.toCharArray()) {
			if(c == '_'){
				capitalizeNextChar = true;
				continue;
			}
			
			if (capitalizeNextChar) {
				strBuilder.append(Character.toUpperCase(c));
			}
			else{
				strBuilder.append(c);
			}
			capitalizeNextChar = false;
		}
		
		return strBuilder.toString();
	}
	
	public static String ApacheUtilsMethod(String str){
		StringBuffer strBuffer = new StringBuffer();
		
		String[] tokens = str.split("_");
		for (String s : tokens) {
			strBuffer.append(StringUtils.capitalize(i));
		}
		return strBuffer.toString();
	}

}
