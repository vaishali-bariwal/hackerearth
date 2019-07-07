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
            if(nstr.length() != 0)
            {
                long n = Long.parseLong(nstr);
                long count = 0;
                if(isPowerOfTwo(n))
                {
                    count = n;
                    sb.append(count+"\n");
                }
                else
                {
                    count = check(n);
                    count = count == -1?0:(long)Math.pow(2, (long)count);
                    sb.append(count+"\n");
                }

            }
            else
            {
                System.out.println(sb);
                System.exit(0);
            }
        }
    }
    static boolean isPowerOfTwo(long x)
    {
        // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
        return (x == 1 && (x & (x - 1)) == 0);
    } 
    static long check (long N)
    {
        int s = Long.SIZE;
        for(int i = 0;i < s;i++)
        {
            if( (N & (1 << i)) > 0 )
                return i;
        }
        return -1;
    }
}
