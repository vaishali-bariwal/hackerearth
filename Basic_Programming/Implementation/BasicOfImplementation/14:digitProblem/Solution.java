
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int k = Integer.parseInt(name[1]);
        int n = name[0].length();
        int i = 0;
        while(k > 0)
        {
            if(name[0].charAt(i) != '9')
            {
                System.out.print(9);
                i++;
                k--;
            }
            else
            {
                System.out.print(name[0].charAt(i));
                i++;
            }
            
        }
        for( i = i; i < n;i++)
        {
            System.out.print(name[0].charAt(i));
        }
    }
}
