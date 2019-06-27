import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int i = 1;i <= n;i++)
            {
                for(int j = 1;j <= n;j++)
                {
                    if(i!=j)
                    {
                        if((i^j) <= n)
                        {
                            count++;
                        }
                    }
                }
            }
            sb.append(count/2+"\n");
        }
        System.out.println(sb);
    }
}