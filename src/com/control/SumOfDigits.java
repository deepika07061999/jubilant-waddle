 package com.control;

public class SumOfDigits {

	public static void main(String[] args) {
		int number=456;
		int sum=0;
		int temp=0;
		while(number>0) {
			temp=number%10;
			sum=sum+temp;
			number/=10;
			
		}System.out.println(sum);

	}

}
