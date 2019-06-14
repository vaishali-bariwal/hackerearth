
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Solution {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] st = str.split(" ");
        int n = Integer.parseInt( st[0]);
        int q = Integer.parseInt( st[1]);
        str = br.readLine();
        st = str.split(" ");
 
        long[] sum = new long[n + 1];
        sum[0] = 0;
        for (int i = 1; i <= n; ++i) {
            sum[i] = sum[i - 1] + Long.parseLong(st[i - 1]);
        }
        while (q-- > 0) {
            str = br.readLine();
            st = str.split(" ");
            int l = Integer.parseInt(st[0]);
            int r = Integer.parseInt(st[1]);
            long mean = (sum[r] - (sum[l - 1])) / (r - l + 1);
            System.out.println((long) Math.floor(mean));
        }
    }
}
