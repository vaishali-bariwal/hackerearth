import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[n];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }
         
         StringBuilder[] sb = queue_and_stack(A);
         System.out.println(sb[0]);
         String s[] = sb[1].toString().split(" ");
         for (int i = s.length - 1; i >= 0; i--) {
             wr.write(s[i]+" ");
         }
         wr.close();
         br.close();
    }
    static StringBuilder[] queue_and_stack(int[] a){
        // Write your code here
        int n = a.length;
        StringBuilder[] sb = new StringBuilder[2];
        sb[0] = new StringBuilder("");
        sb[1] = new StringBuilder("");
        for(int i = 0; i < n;i++)
        {
            if(isPrime(a[i]))
            {
                sb[0].append(a[i]+" ");
            }
            else
            {
               sb[1].append(a[i]+" ");
            }
        }
        return sb;
    }
    static boolean isPrime(int n) 
    { 
        // Check from 2 to n-1 
        for (int i = 2; i <= n/2; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
}