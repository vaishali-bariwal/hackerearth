import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static long dp[] = new long[100000];
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());                // Reading input from STDIN
        while(T-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            sb.append(fact(dp,n)+"\n");
        }
        System.out.println(sb);
    }
    public static long fact(long[] dp, int n)
    {
        if(n==1||n==0)
        {
            dp[n] = 1;
            return dp[n];
        }
        else{
            if(dp[n] != 0)
            { 
                return dp[n];
            }
            dp[n] = (n * fact(dp,n-1))%1000000007;
            return dp[n];
        }
    }
}
