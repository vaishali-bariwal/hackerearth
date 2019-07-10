
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
            String  ar = br.readLine().trim();
            int l = ar.length(),count = 0;
            int n = Integer.parseInt(ar);
            int min = 1000000,max = 0,m; 
            int v[] = new int[]{0,0,0,0,0,0,0,0,0,0};
            boolean flag = true;
            while(n > 0)
            {
                count++;
                m = n % 10;
                if(min > m) min = m;
                if(max < m) max = m;
                v[m] = v[m]+1;
                n = n/10;
            }
            if(count < l) 
            {
                min = 0;
                v[0] = l - count;
            }
            for(int i = min;i <= max;i++)
            {
                if(v[i] != 1)
                {
                    flag = false;
                    break;
                }
            }
            sb.append(flag ? "YES"+"\n":"NO"+"\n");
        }
        System.out.println(sb);
    }
}
