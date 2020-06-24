import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        for(int i = 1;i < 11;i++)
        {
             sb.append(n*i+"\n");
        }
        System.out.println(sb);

    }
}
