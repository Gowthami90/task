package com.task;

public class StringcontainsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strMonths = new String[]{"January", "February", "March", "April", "May"};
		 
		 //Strings to find
		 String strFind1 = "March";
		 String strFind2 = "December";
		 
		 /*
		 * There are several ways we can check whether a String array 
		 * contains a particular string.
		 * 
		 * First of them is iterating the array elements and check as given below.
		 */
		 
		 boolean contains = false;
		 
		 //iterate the String array
		 for(int i=0; i < strMonths.length; i++){
		 
		 //check if string array contains the string 
		 if(strMonths[i].equals(strFind1)){
		 
		 //string found
		 contains = true;
		 break;
		 
		 }
		 }
		 if(contains){
		 System.out.println("String array contains String " + strFind1);
		 
		 }else{
		 System.out.println("String array does not contain String " + strFind1);
		 }
	}

}
