
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String ar[] = br.readLine().split(" ");
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = Integer.parseInt(ar[i]);
        }
        Arrays.sort(a);
       int min = a[0] , max = a[n-1],count=0;
        for(int i = 1;i < n;i++)
        {
            if(min + 1 == a[i])
            {
                min = a[i];
                count++;
            }
        }
        System.out.println(min == max ? "YES" : "NO");
   }
}
