package com.shopeyin5;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] strings = {"ABC", "ABC123", "abc", "abc123ABC"};
	        for (String s : strings) {
	             System.out.println((s).equals(s.toLowerCase()));
	        }

	}
	
	public static String toLowerCase(String s) {
	        char[] values = s.toCharArray();
	        for (int i = 0; i < values.length; ++i) {
	            if (Character.isLetter(values[i]) && Character.isUpperCase(values[i])) {
	                values[i] = Character.toLowerCase(values[i]);
	            }
	        }
	        System.out.println(values);
	        return new String(values);
	}
}

