package org.naic.boyd.test;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		if(args.length < 2) {
			throw new RuntimeException("You must include two arguments");
		}
		if(args.length > 2) {
			throw new IllegalArgumentException("There only needs to be two arguments");
		}
		
		System.out.println(isAnagram(args[0], args[1]));

	}
	
	public static boolean isAnagram(String a, String b) {
		//Remove white spaces from strings
		a = a.replaceAll("\\s", "");
		b = b.replaceAll("\\s", "");
		
		//Convert strings to uppercase
		a = a.toUpperCase();
		b = b.toUpperCase();
		
		//Convert to character array
		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();
		
		//Sort characters in the arrays
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		//Convert back to string
		a = new String(arrayA);
		b = new String(arrayB);
		
		//Test equality of strings and return
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}
}
