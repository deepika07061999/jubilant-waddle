package com.control;

public class ReverseOfSentence {

	public static void main(String[] args) {
		String input="I Learn Java";
		 String[] splitedStrings = input.split("\\s");
		 for (int i = 0; i < splitedStrings.length; i++) {
			 String reverse="";
			for (int j=splitedStrings[i].length()-1;j>=0;j--) {
				
			    char charAt = splitedStrings[i].charAt(j);
			    reverse=reverse+charAt;
			    
			}System.out.print(reverse+"  ");
		}

	}

}
