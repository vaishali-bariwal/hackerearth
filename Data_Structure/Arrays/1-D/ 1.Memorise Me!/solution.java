
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
   public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int[] a = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            if(hm.containsKey(a[i]))
            {
                int count = hm.get(a[i]);
                hm.put(a[i],count+1);
            }
            else
            {
                hm.put(a[i],1);
            }
        }
        int Q = Integer.parseInt(br.readLine());
        for(int i = 0;i < Q; i++)
        {
            int x = Integer.parseInt(br.readLine());
            
            if(hm.get(x)==null)
            {
                sb.append("NOT PRESENT"+"\n" );
            }
            else
            {
                sb.append(hm.get(x)+"\n");
            }
        }
        System.out.println(sb);
    }
}
