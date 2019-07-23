
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n];
        long   max = -1;
        for(int i = 0; i < n;i++)
        {
            a[i] = sc.nextLong();
            max = Math.max(max,a[i]);
        }
        if(n == 1)
        {
            if(k%2 == 0) System.out.println(a[0]);
            else System.out.println(-1);
        }
        else
        {
            if (k > n) 
            {
               System.out.println(max);
            }
            else
            {
                max = -1;
                for(int i = 0;i < k-1;i++)
                {
                    max = Math.max(max,a[i]);
                }
                if(n==k)System.out.println(max);
                else{
                    System.out.println(Math.max(max,a[k]));}
            }
        }
        
     }
}
