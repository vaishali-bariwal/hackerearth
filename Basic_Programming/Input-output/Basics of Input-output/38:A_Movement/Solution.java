import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int c = 0;
        if(n%5==0)
        {
            c = n/5;
        }
        else
        {
            c = n/5 + 1;
        }
        System.out.println(c);

    }
}
