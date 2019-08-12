import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int m = Integer.parseInt(name[1]);
        long[][] a= new long[n][m];
        for(int i = 0;i < n;i++)
        {
            String[] arr = br.readLine().split(" ");
            for(int j =0;j < m;j++)
            {
             a[i][j] = Long.parseLong(arr[j]);
            }
        }
        String v[] = br.readLine().split(" "); 
        long v1 = Long.parseLong(v[0]);
        long v2 = Long.parseLong(v[1]);
        long v3 = Long.parseLong(v[2]);
        long v4 = Long.parseLong(v[3]);
        long sumr = 0, sumor = 0 ,sumrv1 = 0, sumrv2 =  Math.abs(m * v2); 
        long sumc = 0, sumoc = 0 ,sumcv3 = 0, sumcv4 =  Math.abs(n * v4); 
        for(int i = 0;i < n;i++)
        {
            sumrv1 = 0; sumor = 0;
            for(int j =0;j < m;j++)
            {
             sumrv1 += Math.abs(a[i][j]+v1);
             sumor += Math.abs(a[i][j]);
            }
            sumr += Math.max(sumor,Math.max(sumrv1,sumrv2));
        }
        for(int i = 0;i < m;i++)
        {
            sumcv3 = 0;sumoc = 0;
            for(int j =0;j < n;j++)
            {
             sumcv3 += Math.abs(a[j][i]+v3);
             sumoc += Math.abs(a[j][i]);
            }
            sumc += Math.max(sumoc,Math.max(sumcv3,sumcv4));
        }
        if(sumr >= sumc) System.out.println(sumr);
        else System.out.println(sumc);

    }
}
