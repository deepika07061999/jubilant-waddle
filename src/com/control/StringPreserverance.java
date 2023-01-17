package com.control;

public class StringPreserverance {

	public static void main(String[] args) {
		 String str = "hi welcome to Tutorialspoint";
	      StringBuffer sb= new StringBuffer(str);
	      StringBuffer reverse = sb.reverse();
	      for(int j=0 ; j<reverse.length(); j++){
	    	 // System.out.println(sb.charAt(j));
		         if(reverse.charAt(j)==' '){
		         reverse.deleteCharAt(j);
		      }}
	     System.out.println(reverse);
	      for(int i=0 ; i<str.length(); i++){
	         if(str.charAt(i)== ' '){
	         reverse.insert(i, " ");
	      }
	   }
	   //sb.append("");
	   System.out.println(reverse);

}
}