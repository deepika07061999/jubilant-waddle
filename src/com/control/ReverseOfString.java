package com.control;

import java.util.Iterator;

public class ReverseOfString {

	public static void main(String[] args) {
		String stringToReverse="malayalam";
		String originalString=stringToReverse;
		String reverseString="";
		for(int i=stringToReverse.length()-1;i>=0;i--) {
			char c = stringToReverse.charAt(i);
			reverseString=reverseString+c;
		}
		System.out.println(reverseString);
		if (reverseString.equalsIgnoreCase(originalString)) {
			System.out.println("The String is palindrome");
		}else {
			System.out.println("The String is Not Palindrome");
		}


	}

}
