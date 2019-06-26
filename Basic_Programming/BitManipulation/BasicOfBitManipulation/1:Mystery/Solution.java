import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String nstr;
         while(true)
        {
            nstr = br.readLine();
            if(nstr!=null)
            {
                long n = Long.parseLong(nstr);
                int count = 0;
                while(n > 0)
                {
                    n = n&(n-1);
                    count++;
                }
                sb.append(count+"\n");
            }
            else
            {
                System.out.println(sb);
                System.exit(0);
            }
        }
    }
}
