import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        while(t-- > 0)
        {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String[] arr = br.readLine().split(" ");
            int[] a= new int[n];
            for(int i = 0;i < n;i++)
            {
                 a[i] = Integer.parseInt(arr[i]);
            }
            for(int i = 0;i < n-1&&k > 0;++i)
            {
                int min = i;
                for(int j = i+1;j < n;++j)
                {
                    if(j-i > k) break;
                    if(a[min]>a[j])
                    {
                        min = j;
                    }
                }
                for(int l = min;l > i;--l)
                {
                    int temp = a[l];
                    a[l] = a[l-1];
                    a[l-1] = temp;
                }
                k -= min-i;
            }
            for(int i = 0;i < n;i++)
            {
                 sb.append(a[i]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
