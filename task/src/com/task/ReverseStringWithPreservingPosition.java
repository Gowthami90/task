package com.task;

public class ReverseStringWithPreservingPosition {
	 static void reverseString(String str)
	    {
	     
	 //Converting str to char array 'stringArray'
    
    char[] a = str.toCharArray();
     
    //Defining a new char array 'resultArray' with same size as inputStringArray
     
    char[] resultArray = new char[a.length];
     
    //First for loop : 
    //For every space in the 'inputStringArray', 
    //we insert spaces in the 'resultArray' at the corresponding positions 
     
    for (int i = 0; i < a.length; i++) 
    {
        if (a[i] == ' ') 
        {
            resultArray[i] = ' ';
        }
    }
     
    //Initializing 'j' with length of resultArray
     
    int j = resultArray.length-1;
             
    //Second for loop :
    //we copy every non-space character of inputStringArray 
    //from first to last at 'j' position of resultArray
     
    for (int i = 0; i < a.length; i++)
    {
        if (a[i] != ' ') 
        {
            //If resultArray already has space at index j then decrementing 'j'
             
            if(resultArray[j] == ' ')
            {
                j--;
            }
             
            resultArray[j] = a[i];
             
            j--;
        }
    }
     
    System.out.println(str+" ---> "+String.valueOf(resultArray));
}
 
public static void main(String[] args)
{
    reverseString("I love India");
     
    reverseString("JAVA JSP ANDROID");
     
    reverseString("1 22 333 4444 55555");
}
		}
  
