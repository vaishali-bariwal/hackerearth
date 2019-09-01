import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] a = new long[111100];
        long[] b = new long[111100];
        long[] a1 = new long[111100];
        long[] b1 = new long[111100];
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        long n = Long.parseLong(name[0]);
        long q = Long.parseLong(name[1]);
        String[] arr = br.readLine().split(" ");
        String[] brr = br.readLine().split(" ");
        for(int i = 1;i <= n;i++)
        {
             a[i] = Long.parseLong(arr[i-1]);
        }
        for(int i = 1 ; i <=n; i++)
        {
            b[i] = Long.parseLong(brr[i-1]);
        }
        for(int i = 1 ; i <= n; i++)
        {
            if((i&1)==1) a1[i] = a1[i-1] + a[i];
            else a1[i] = a1[i-1] + b[i];
        }
        for(int i = 1; i <= n; i++)
        {
            if((i&1)==1) b1[i] = b[i] + b1[i-1];
            else b1[i] = a[i] + b1[i-1];
        }
        for(int i = 1 ; i <= q; i++)
        {
            String clr[] = br.readLine().split(" ");
            int check = Integer.parseInt(clr[0]);
            int s = Integer.parseInt(clr[2]);
            int f = Integer.parseInt(clr[1]);
            if(check == 1)
            {
                if((f&1)==1)
                sb.append((a1[s] - a1[f-1])+"\n");
                else
                sb.append((b1[s] - b1[f-1])+"\n");
            }
            else
            {
                if((f&1)==1)
                sb.append((b1[s] - b1[f-1])+"\n");
                else
                sb.append((a1[s] - a1[f-1])+"\n");
            }
        }
        System.out.println(sb);
    }
}
