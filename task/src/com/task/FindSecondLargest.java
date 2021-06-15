package com.task;

public class FindSecondLargest {
	  // Initialize these to the smallest value possible
	 static int first,second;
	 
	public static void main(String args[])
    {
        int[] arr={7,5,6,1,4,2};
        int secondHighest=findSecondLargestNumberInTheArray(arr);
        System.out.println("Second largest element in the array : "+ secondHighest);
    }
 
    public static int findSecondLargestNumberInTheArray(int array[])
    {
        // Initialize these to the smallest value possible
     
    
 
        // Loop over the array
        for (int i = 0; i < array.length; i++) { 
            // If current element is greater than highest 
            if (array[i] > first) {
 
                // assign second highest element to highest element 
                second=first;
 
                // highest element to current element
                first = array[i];
            } else if (array[i] > second && array[i]!=first)
                // Just replace the second highest
                second = array[i];
        }
 
        // After exiting the loop, secondHighest now represents the second
        // largest value in the array
        return second;
    }

}
