
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int x = Integer.parseInt(name[1]);
        int a[] = new int[n];
        String arr[] = br.readLine().split(" ");
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
        }
        for(int i = 0;i < x;i++)
        {
            int k = i;
            for(int j = i+1;j < n;j++)
            {
                if(a[k] > a[j])
                {
                    k = j;
                }
            }
            int t =a[k];
            a[k] = a[i];
            a[i] = t;
        }
         for(int i = 0;i < n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
