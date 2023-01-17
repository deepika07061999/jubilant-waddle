package com.control;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number=9474;
		int originalNumber=number;
		int temp1=number;
		int noOfDigits=0;
		int amstrongCheck=0;
		int temp;
		while (number>0) {
			temp=number%10;
			noOfDigits=noOfDigits+1;
			number=number/10;
		}System.out.println(noOfDigits);
		while (originalNumber>0) {
			temp=originalNumber%10;
			amstrongCheck=(int) (amstrongCheck+Math.pow(temp, noOfDigits));
			originalNumber=originalNumber/10;	
		}System.out.println(amstrongCheck);
		if (temp1==amstrongCheck) {
			System.out.println("Amstrong Number");
			
		}else {
			System.out.println("Not an Amstrong Number");
		}

	}

}
