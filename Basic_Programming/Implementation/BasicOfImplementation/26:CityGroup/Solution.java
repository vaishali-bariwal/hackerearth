
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk[] = br.readLine().split(" "); 
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int j = 1;
        System.out.println(k);
        int a[] = new int[n+1];

        while( j < k+1)
        {
            String si[] = br.readLine().split(" ");
            int s = Integer.parseInt(si[0]);
            for(int i = 1;i <=s; i++)
            {
                a[Integer.parseInt(si[i])] = j;
            }
            j++;
        }
        int q = Integer.parseInt(br.readLine());
        while(q > 0)
        {
            String xy[] = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            int diff = a[x] - a[y];
            System.out.println(Math.abs(diff));
            q--;
        }
    }
}
