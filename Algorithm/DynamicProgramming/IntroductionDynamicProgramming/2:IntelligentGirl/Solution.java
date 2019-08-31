import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
   public static void main(String args[] ) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        String s = br.readLine();//System.out.println(s);
        int l = s.length();
        int[] dp = new int[l+1];
        dp[l] = 0;
        for(int i = l-1;i >=0;i-- )
        {
        	dp[i] = dp[i+1] + 1 - (Character.getNumericValue(s.charAt(i))%2);
        }
        for(int j = 0;j < l;j++)
        {
            System.out.print(dp[j]+" ");
        }
    }
}
