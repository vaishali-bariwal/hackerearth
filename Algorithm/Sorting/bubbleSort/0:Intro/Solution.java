
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String[] arr = br.readLine().split(" ");
        int a[] =new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
        }
        int count = 0;
       for(int i = 0;i < n;i++)
       {
           for(int j = 0;j < n-1-i;j++)
           {
               if(a[j] > a[j+1])
               {
                   int t = a[j];
                   a[j] = a[j+1];
                   a[j+1] = t;
                   count++;
               }
           }
       }
        System.out.println(count);
    }
}
