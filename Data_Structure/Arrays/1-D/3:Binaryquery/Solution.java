import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String nq[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        int a[] = new int[n];
        String arr[] = br.readLine().split(" ");
        for(int i = 0;i <  n;i++)
            a[i] = Integer.parseInt(arr[i]);  
        for(int i = 0;i < q;i++)
        {
            String query[] = br.readLine().split(" ");
            if(query.length == 2)
            {
                int flip = Integer.parseInt(query[1]);
                a[flip - 1] = 1 ^ a[flip - 1];
            }
            else
            {
                int l = Integer.parseInt(query[1]);
                int r = Integer.parseInt(query[2]);
                if((a[r-1]&1)==1)
                    sb.append("ODD"+"\n");
                else
                    sb.append("EVEN"+"\n");
            }
        }   
        System.out.println(sb);  
    }
}
