
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();              
        int t = Integer.parseInt(name);
        while(t > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int k = 1;
            for(int i = 1;i <= n ;i++)
            {
                for(int j = 0; j < n - i;j++ )
                {
                    System.out.print(" ");
                }
                for(int j = 0; j < k;j++ )
                {
                    System.out.print("*");
                }
                for(int j = 0; j < n - i;j++ )
                {
                    System.out.print(" ");
                }
                System.out.println("");
                k = k + 2;
            }
            t--;
        }
    }
}
