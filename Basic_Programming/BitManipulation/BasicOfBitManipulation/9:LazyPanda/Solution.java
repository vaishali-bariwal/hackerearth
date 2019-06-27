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
            long count = 1;
            long n = Long.parseLong(br.readLine().trim());
            count = count_one(n);
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
    static long count_one (long n)
    {
        long count = 0;
        while(n != 0)
        {
        n = n&(n-1);
        count++;
        }
        return count;
    }
} 