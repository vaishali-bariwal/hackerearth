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
            int count = 1;
            int n = Integer.parseInt(br.readLine());
            if(isPowerOfTwo(n)) sb.append(count+"\n");
            else{
                count = count_one(n);
                sb.append(count+"\n");
            }
        }
        System.out.println(sb);
    }
    static int count_one (int n)
    {
        int count = 0;
        while(n != 0)
        {
        n = n&(n-1);
        count++;
        }
        return count;
    }
    static boolean isPowerOfTwo(int x)
    {
        // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
        return (x == 1 && (x & (x - 1)) == 0);
    }  
} 