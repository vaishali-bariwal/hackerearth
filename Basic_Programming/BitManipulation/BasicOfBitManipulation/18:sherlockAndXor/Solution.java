
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
            int a[] = new int[n] , count = 0,xor = 0;
            String arr[] = br.readLine().split(" ");
            for(int i = 0; i < n;i++)
                a[i] = Integer.parseInt(arr[i]);
            for(int i = 0;i < (1 << n); ++i)
            {
                xor = 0;
                for(int j = 0;j < n;++j)
                {
                    if((i & (1 << j)) != 0)
                        xor = xor ^ a[j];
                }
                if((xor&1) == 1) count++;
            }
            sb.append(count/2+"\n");
        }
        System.out.println(sb);
    }
}
