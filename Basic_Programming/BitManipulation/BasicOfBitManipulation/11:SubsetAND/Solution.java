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
            boolean check = false;
            String zn[] = br.readLine().split(" ");
            int z = Integer.parseInt(zn[0]);
            int n = Integer.parseInt(zn[1]);
            int s[] = new int[n];
            int and = z;
            String set[] = br.readLine().split(" ");
            for(int i =0;i<n;i++)
                s[i] = Integer.parseInt(set[i]);
            for(int i = 0;i < (1 << n); i++)
            {
                for(int j = 0;j < n;j++)
                {
                    //System.out.println("i = "+i+"j = "+j+"  & "+ (i & (1 << j)));
                    if((i & (1 << j))!=0)
                    {
                        and = and & s[j];
                    }
                }
                System.out.println();
                if(and == 0)
                {
                    check = true;
                    break;
                }
            }
            sb.append(check?"Yes\n":"No\n");
        }
        System.out.println(sb);
    }
}