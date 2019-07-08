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
            long s = 0,i ,j;
            long n = Long.parseLong(br.readLine());
            for(i=2;i<n;i=i*2)
            {
                for(j=1;j<i;j=j*2)
                    {
                        if(i+j<=n)
                            s=(s+i+j)%1000000007;
                    }
            }
            sb.append(s+"\n");
        }
        System.out.println(sb);
    }
     public static long count(long no)
     {
         long c = 0 , n = no;
         while(n > 0)
         {
             n = n&(n-1);
             c++;
             if(c > 2) return 0;
          }
         if(c == 2)  return no;
         else return 0;
     }
}