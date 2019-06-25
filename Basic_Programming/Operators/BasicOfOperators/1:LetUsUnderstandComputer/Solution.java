
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();           // Reading input from STDIN
        while(T-- > 0)
        {
            long X = Long.parseLong(br.readLine());
            long q = 1, e = X, z = 0, ans = Integer.MAX_VALUE;
            while(q<=e) {
                z = (q+e)/2;
                if(countBits(X/z)<=countBits(z)) {
                    ans = z;
                    e = z-1;
                } else {
                    q = z+1;
                }
            }
            sb.append((X-ans+1)+"\n");
        }
        System.out.println(sb);
    }
    static long countBits(long n) 
    { 
        long count = 0; 
        while (n != 0) 
        { 
            count++; 
            n >>= 1; 
        } 
          
        return count; 
    } 
}
