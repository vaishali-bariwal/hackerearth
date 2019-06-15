
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String te = br.readLine();        
        int t = Integer.parseInt(te);
        boolean v[] = new boolean[26];
        v[0] = true;v[4] = true;v[8] = true;v[14] = true;v[20] = true;
        
        while(t > 0)
        {
            long sum = 0;
            String str = br.readLine();
            if(str != null && str != "")
            {
            String ustr = str.toUpperCase() ;
            int n =  str.length();
            for(int i = 0;i < n;i++){
                    if(v[ustr.charAt(i) - 65])
                    {
                        long m = n - i;
                        long prev = (n - m) * m + m;
                        sum = sum + prev;
                    }
            }
            }
            System.out.println(sum);
            t--;
        }
    }
}
