package com.control;

public class Factorial {

	public static void main(String[] args) {
		int number=5;
		int fact=1;
		for(int i=number;number>0;number--) {
			fact=fact*number;
		}System.out.println(fact);
	}

}
