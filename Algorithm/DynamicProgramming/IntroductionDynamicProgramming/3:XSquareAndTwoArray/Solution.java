import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] a = new int[111100];
        int[] b = new int[111100];
        int[] a1 = new int[111100];
        int[] b1 = new int[111100];
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int q = Integer.parseInt(name[1]);
        String[] arr = br.readLine().split(" ");
        String[] brr = br.readLine().split(" ");
        for(int i = 1;i <= n;i++)
        {
             a[i] = Integer.parseInt(arr[i-1]);
        }
        for(int i = 1 ; i <=n; i++)
        {
            b[i] = Integer.parseInt(brr[i-1]);
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
