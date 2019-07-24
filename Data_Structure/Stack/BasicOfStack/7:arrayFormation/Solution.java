import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] a = new int[n];
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
         for(int i=0; i< n; i++)
         {
         	a[i] = Integer.parseInt(arr_A[i]);
            if(isPrime(a[i]))
                {
                    sb1.append(a[i]+" ");
                    a[i] = 0;
                }
         }
         for(int i = n-1;i >=0;i--)
         {
            if(a[i]!=0)
            {
                sb2.append(a[i]+" ");
            }
         }
         System.out.println(sb1);
         System.out.println(sb2);
         wr.close();
         br.close();
    }
 
    static boolean isPrime(int n) 
    {
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
  
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    } 
}