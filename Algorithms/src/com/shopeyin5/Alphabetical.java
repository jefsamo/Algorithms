package com.shopeyin5;

public class Alphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(!isAlphabetical("123abc"));
        assert isAlphabetical("aBC");
        assert isAlphabetical("abc");
        assert !isAlphabetical("xyzabc");
        assert isAlphabetical("abcxyz");

	}
	
	public static boolean isAlphabetical(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                return false;
            }
        }
        return true;

	}
}
