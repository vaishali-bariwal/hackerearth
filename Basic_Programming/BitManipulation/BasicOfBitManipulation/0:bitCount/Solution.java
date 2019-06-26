
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            while(n > 0)
            {
                n = n&(n-1);
                count++;
            }
            System.out.println(count);
        }
        

    }
}
