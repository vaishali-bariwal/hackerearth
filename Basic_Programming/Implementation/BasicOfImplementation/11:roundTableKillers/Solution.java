
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nkx[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(nkx[0]);
        int k = Integer.parseInt(nkx[1]);
        int x = Integer.parseInt(nkx[2]);
        int count = 0,i = x;
        boolean[] killed = new boolean[n+1];
        int kill_num = i % k;
        
    }
}
