
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = name.length();
        int count = 0;
        if(name.charAt(n-1) == '6')
        {
            System.out.println(-1);
        }
        else
        {
            for(int i = 0;i < n;i++)
            {
                if(name.charAt(i) != '6')
                {
                    count++;
                }
          
            }
            System.out.println(count);
        }
    }
}
