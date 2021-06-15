package com.task;

public class ReverseString {
	public static void main(String[] args) {
		
		String str="india";
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
     	rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse string is "+ rev);
		
	}
	
	//
	
	/*public static void main(String[] args) {
		
	String str="mother";

	char a[]=str.toCharArray();
     int len=a.length;
     String rev="";
     
     for(int i=len-1;i>=0;i--) {
			
      	rev=rev+str.charAt(i);
 		}
 		
 		System.out.println("Reverse string is "+ rev);
	
}*/

	
	/*public static void main(String[] args) {
		String str="father";
		
	StringBuffer sb= new StringBuffer(str);
	System.out.println(sb.reverse());
}*/
}