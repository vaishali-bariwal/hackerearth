
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int sum = 0,n = name.length();
        for(int i = 0;i < n;i++)
        {
            sum = sum + (name.charAt(i) - 96);
        }
        System.out.println(sum);
    }
}
