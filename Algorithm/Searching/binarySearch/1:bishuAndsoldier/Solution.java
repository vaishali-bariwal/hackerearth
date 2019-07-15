/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.*/
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
//import for Scanner and other utility classes
import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/
 
 
      		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		// Define an array of integers of size N. 
		int[] numArray = new int[N];		
		
 
		int sum = 0;
		int count=0;
		for(int i=0; i<N; i++){
			numArray[i] = s.nextInt(); // Get the input
		}
		int round = s.nextInt();
		int[] roundArray = new int[round];		
		for(int i=0; i<round; i++){
			roundArray[i] = s.nextInt(); // Get the input
		}
		
	    for(int j=0; j<round; j++){
	        count=0;
	        sum=0;
	    	for(int i=0; i<N; i++){
			if(numArray[i] <= roundArray[j]){
			    count++;
			    sum=sum+numArray[i];
			}
			
			
		}
 System.out.println(count+" "+sum);
	    }
 
        // Write your code here
 
    }
}
