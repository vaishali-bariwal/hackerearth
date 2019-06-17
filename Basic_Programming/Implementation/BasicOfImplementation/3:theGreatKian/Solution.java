
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String arr[] = br.readLine().split(" "); 
        long a[] = new long[3];
        a[0] =0 ;a[1] = 0;a[2]=0;
        for(int i = 0;i < 3;i++)
        {
            int j = i;
            while(j < n)
            {
                int k = Integer.parseInt(arr[j]);
                a[i] = a[i] + k;
                j = j + 3;
            }
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
    }
}
