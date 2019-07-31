import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int T = Integer.parseInt(name);
        while(T-- > 0)
        {
            String nx[] = br.readLine().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);
            int a[] = new int[n];
            String arr[] = br.readLine().split(" ");
            for(int i =0;i < n;i++)
            {
                a[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(a);
            int c = 0,i;
            for(i =0;i < n;i++)
            {
                c += a[i];
                if(c >= x) break;
            }
            
            System.out.println(i);
        }

    }
}
