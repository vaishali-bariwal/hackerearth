
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = br.readLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String[] arr = br.readLine().split(" ");
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        while(q > 0)
        {
            String[] qry = br.readLine().split(" ");
            int t = Integer.parseInt(qry[0]);
            int x = Integer.parseInt(qry[1]);
            int y = Integer.parseInt(qry[2]);
            if(t == 1)
            {
                a[x] = y;
            }
            else
            {
                int sum = 0;
                for(int i = x;i <= y;i++)
                {
                    sum = sum + a[i];   
                }
                System.out.println(sum);
            }
            q--;
        }
    }
}
