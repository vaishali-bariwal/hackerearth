import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass
{
    public static void main(String args[] ) throws Exception 
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String T = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(T);
        while(t-- > 0)
        {
            String nk[] = br.readLine().split(" "); 
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String arr[] = br.readLine().split(" "); 
            int[] a = new int[n];
            for(int i = 0;i < n;i++)
            {
                a[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(a);
            int min = a[0];
            min = k - min;
            if(min > 0) sb.append(min+"\n");
            else sb.append(0+"\n");
        }
        System.out.println(sb);
    }
}
