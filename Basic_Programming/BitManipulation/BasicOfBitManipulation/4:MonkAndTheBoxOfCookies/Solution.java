import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            int a[] = new int[33];
            int res = -1,bit = 0;
            int n = Integer.parseInt(br.readLine());
            while(n-- > 0)
            {
                int num = Integer.parseInt(br.readLine());
                for(int i = 0;i < 33;i++)
                {
                    if( (num & 1<<i ) != 0)
                    {  
                        a[i]++;
                    }
                }
            } 
            for(int i = 0;i < 32;i++)
            {
                if(a[i] > res)
                {
                    res = a[i];
                    bit = i;
                }
            }
            sb.append(bit+"\n");
        }
        System.out.println(sb);
    }
}
