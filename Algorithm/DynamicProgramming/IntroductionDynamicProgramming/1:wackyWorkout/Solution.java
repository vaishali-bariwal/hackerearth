import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        
        while(t-- > 0)
        {
            long n = Long.parseLong(br.readLine());
            long ans = fib(n);//fib beacuse n=1ans = 2 ,n=2;ans =3,n=3;ans=5 are making fibnacco series
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
     public static long fib(long n)
     {
        long f[][] = new long[][]{{1,1},{1,0}};
        if(n==0)
            return 0;
        power(f,n+1);
        
        return f[0][0]%1000000007;
     }
     public static void power(long f[][],long n)
     {
         if(n==0||n==1)
            return;
         long m[][] = new long[][]{{1,1},{1,0}};
         power(f,n/2);
         multiply(f,f);
         if(n%2!=0) 
            multiply(f,m);
     }
     public static void multiply(long f[][],long m[][])
     {
         long mod = 1000000007l;
         long a = f[0][0]*m[0][0] + f[0][1]*m[1][0];
         long b = f[0][0]*m[0][1] + f[0][1]*m[1][1];
         long c = f[1][0]*m[0][0] + f[1][1]*m[1][0];
         long d = f[1][0]*m[0][1] + f[1][1]*m[1][1];
         f[0][0] = a%mod;
         f[0][1] = b%mod;
         f[1][0] = c%mod;
         f[1][1] = d%mod;
     }
}
