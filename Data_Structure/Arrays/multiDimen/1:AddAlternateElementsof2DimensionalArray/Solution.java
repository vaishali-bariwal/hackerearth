
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n[] = br.readLine().split(" ");                // Reading input from STDIN
        int sum1 = 0,sum2 =0;
        for(int i = 0;i < n.length;i++)
        {
            if((i&1)==0) sum1 += Integer.parseInt(n[i]);
            else sum2 += Integer.parseInt(n[i]);
        }
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
