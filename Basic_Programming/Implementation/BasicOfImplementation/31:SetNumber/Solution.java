import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        
        for(int i = 0;i < n;i++)
        {
            int no = Integer.parseInt(br.readLine());
            int sum = 0,ans =0;
            for(int j = 0;j< no;j++)
            {
                 sum += (int)Math.pow(2.0, j) ;
               if(sum > no) break;
               ans = sum;
            }
            sb.append(ans+"\n");
        }
        System.out.println(sb);

    }
}
