
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String arr[] = br.readLine().split(" ");
        int a[] = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
        }
        for(int i = 0;i < n;i++)
        {
            int t = findsmall(a,i);
            sb.append(t+" ");
        }
        System.out.println(sb);
    }
    public static int findsmall(int[] a,int k)
    {
        int t = -1;
        for(int i = k-1; i >= 0;i--)
        {
            if(a[i] < a[k])
            {
                return a[i];
            }
        }
        return t ;
    }
}
