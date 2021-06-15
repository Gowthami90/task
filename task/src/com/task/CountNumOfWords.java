package com.task;

public class CountNumOfWords {
	public static void main(String[] args) {
		
	String str = "Java   programming question";
	
	System.out.println(countWord(str));
	}
	public static int countWord(String str) {
	int Count = 1;
	int len = str.length();
	for(int i = 0; i < len-1; i++) {
	if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {				
       Count++;
	}
	}
	return Count;
	}


}
