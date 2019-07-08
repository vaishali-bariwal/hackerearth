
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0)
        {
            String mp[] = br.readLine().split(" ");
            long m = Long.parseLong(mp[0]);
            long p = Long.parseLong(mp[1]);
            long xor = m ^ p;
            sb.append(count(xor)+"\n");
        }
        System.out.println(sb);
    }
    public static long count(long n)
    {
        long c = 0;
        while(n > 0)
        {
            n = n & (n - 1);
            c++;
        }
        return c;
    }
}
