/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        double arr[][] = new double[1001][1001];
        
        for(int i=0;i<1001;i++){
            for(int j=0;j<1001;j++){
                if(i==0){
                    arr[i][j]=1.0;
                    continue;
                }
                
                if(j==0){
                    arr[i][j]=1.0;
                    continue;
                }
                
                if(i==1){
                    arr[i][j]=1/2.0;
                    continue;
                }
                
                arr[i][j] = (i/(double)(i+j));
                if(j>=2)
                arr[i][j]+= ((j)/(double)(i+j))*((j-1)/(double)(i+j-1))*arr[i][j-2];
            }
        }
        
        int x = s.nextInt();
        for(int i=0;i<x;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.printf("%.6f\n",arr[a][b]);
        }
        
 
    }
}