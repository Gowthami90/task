package com.task;

public class ReverseEachWord {

	public static void main(String[] args) {
	String str="i love india";
	String [] words=str.split(" ");
	String revString=" ";
	//for (int i=0;i<words.length;i++) {
		
	//	String word = words[i];
	
	for(String word:words) {
		String revWord=" ";
	
		for(int j=word.length()-1; j>=0; j--) {
			
			revWord=revWord+word.charAt(j);
	}	
	revString =revString+revWord+" ";
	}
	
	
	System.out.println("Reverse string is "+ revString);
	
	}
}
