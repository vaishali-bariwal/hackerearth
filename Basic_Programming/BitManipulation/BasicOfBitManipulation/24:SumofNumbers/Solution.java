import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n],sumofsubset = 0;
            String str[] = br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(str[i]);
            }
            boolean check = false;
            int sum = Integer.parseInt(br.readLine());
            for(int i = 0;i < (1 << n);i++)
            {
                sumofsubset = 0;
                for(int j = 0;j < n;j++)
                {
                    if((i&(1<<j)) != 0) 
                    {
                        sumofsubset = sumofsubset + a[j];
                    }
                }
                if(sum == sumofsubset) 
                {
                    sb.append("YES"+"\n");
                    check = true;
                    break;
                }
            }
            if(!check) sb.append("NO"+"\n");
        }
        System.out.println(sb);
    }
}