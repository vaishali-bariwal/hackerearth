
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int  k = Integer.parseInt(name[1]);
        String[] arr = br.readLine().split(" ");
        int a[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
        }
        HashSet<Integer> se = new HashSet<Integer>();
        int c = 0;
        
        for(int i=0;i<n;i++)
        {
          if(se.contains(k - a[i]))
            {
              c++;  
            }
          else
            se.add(a[i]);
        }
 
     if(c != 0) {
         System.out.println("YES");
         }
    else{   
        System.out.println("NO");
        } 
    
    }
}
