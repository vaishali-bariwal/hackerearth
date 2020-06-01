import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int T = Integer.parseInt(name);
        for(int t = 0;t < T;t++)
        {
            int n = Integer.parseInt(br.readLine());

            for(int i = 1;i <= n;i++)
            {
                for(int s = 0; s < i;s++)
                {
                    System.out.print("*");
                }
                for(int h = 0; h < (n-i)*2;h++)
                {
                    System.out.print("#");
                }
                for(int s = 0; s < i;s++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
