package com.task;

public class ReverseWord {

	public static void main(String[] args) {
		String str="i love india";
		String [] a=str.split(" ");
		
		String revStringWords="";
				
		for(int i=a.length-1; i>=0; i--) {
			
			revStringWords=revStringWords+a[i]+" ";

	}
		System.out.println(revStringWords);

}
}