
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n] ;
            long count = 0;
            String arr[] = br.readLine().split(" ");
            for(int i = 0; i < n;i++)
            {
                a[i] = Integer.parseInt(arr[i]);
                if((a[i]&1)==0)
                {
                    count++;
                }
            }
            count = (n-count)*count;
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
