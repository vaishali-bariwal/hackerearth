
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        while(t > 0)
        {
            String str = br.readLine();
            long n = str.length();
            System.out.println((n*(n+1))/2);
            t--;
        }
    }
}
