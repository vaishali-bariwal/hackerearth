import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.ArrayList;
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
            ArrayList<bitCount> al = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(str[i]);
                bitCount b = new bitCount(a[i]);
                b.bit_Count = count_one(a[i]);
                al.add(b);
            }
            Collections.sort(al);
            for( bitCount i : al)
            {
                sb.append(i.num +" ");
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
    static class bitCount implements Comparable<bitCount>
    {
        int num;
        int bit_Count;
        public bitCount(int n)
        {
            this.num = n;
        }
    public int compareTo(bitCount t)
    {
        return this.bit_Count - t.bit_Count;
    }
}
}