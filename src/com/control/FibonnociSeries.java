package com.control;

public class FibonnociSeries {

	public static void main(String[] args) {
		int noOfnumber=10;
		int first=0;
		int second=1;
		int next;
		System.out.print(first +" "+second);
		
		for(int i=0;i<noOfnumber;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.print(" "+next);
		}
		
	}

}
