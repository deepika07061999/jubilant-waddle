package com.control;

public class CountOfEvenNumbers {

	public static void main(String[] args) {
		int num1=1;
		int count=0;
		int num2=100;
		for(int i=num1;num1<=num2;num1++) {
			if (num1%2==0) {
				count=count+1;
			}
		}System.out.println(count);

	}

}
