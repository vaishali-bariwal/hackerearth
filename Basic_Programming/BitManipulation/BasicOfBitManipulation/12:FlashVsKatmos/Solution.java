import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            String str[] = br.readLine().split(" ");
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(str[i]);
                hm.put(count_one(a[i]), a[i]);
            }
            ArrayList<Integer> al = new ArrayList<>(hm.keySet());
            Collections.sort(al);
            for(Map.Entry m : hm.entrySet())
            {
                sb.append(m.getValue()+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    static int count_one (int n)
    {
        int count = 0;
        while(n != 0)
        {
        n = n&(n-1);
        count++;
        }
        return count;
    }
}