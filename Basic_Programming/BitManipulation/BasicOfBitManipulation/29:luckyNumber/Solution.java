
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        while(t-- > 0)
        {
            long sum = 0,i ,j;
            long n = Long.parseLong(br.readLine());
            for(i=2;i<n;i*=2)
            {
                for(j=1;j<i;j*=2)
                {
                    if(i+j<=n)
                    sum=(sum%1000000007+i+j)%1000000007;
                }
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
}
