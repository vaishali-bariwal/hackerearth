
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int max = 0,temp = 0,c = 0;
        for(int i = 0;i <= n;i++)
        {
            temp = i^n;
            if(temp > max)
            {
                max = temp;
                c = i;
            }
        }
        System.out.println(n+" "+c);
    }
}
