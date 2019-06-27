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
            long  count = 0;
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[n];
            String arr[] = br.readLine().split(" ");
            for(int i = 0;i < n;i++)
            {
                a[i] = Long.parseLong(arr[i]);
                count = count^a[i];
            }
            sb.append(count==0?"-1\n":count+"\n");
        }
        System.out.println(sb);
    }
}