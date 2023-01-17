package com.control;

public class CountOfNumber {

	public static void main(String[] args) {
		int number=3214;
		int count=0;
		int temp=0;
		while (number>0) {
			temp=number%10;
			count=count+1;
			number=number/10;
			
		}System.out.println(count);

	}

}
