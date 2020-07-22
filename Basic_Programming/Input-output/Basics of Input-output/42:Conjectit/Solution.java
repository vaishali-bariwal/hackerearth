import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int T = Integer.parseInt(name);
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            while(n>1)
            {
                if(n%2==0)
                {
                    n=n/2;
                }
                else
                {
                    n=(3*n)+1;
                }
            }
            if(n==1)
                {
                    sb.append("YES"+"\n");
                }
            else
                {
                    sb.append("YES"+"\n");
                }
            
            }
            
        System.out.println(sb);

    }
}
