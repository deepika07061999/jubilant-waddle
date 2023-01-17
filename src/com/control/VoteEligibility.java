package com.control;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("eligible");
		}else {
			System.out.println("not eligible");
		}
		scan.close();

	}

}
