
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int l = Integer.parseInt(name);
        int max = 0 ;
        while(l > 0)
        {
            String s= br.readLine();
            int n = s.length();
            int sum = Character.getNumericValue(s.charAt(0));
            for(int i = 2;i < n;i = i + 2)
            {
                int a = Character.getNumericValue(s.charAt(i));
                if(s.charAt(i-1) == '+') {
                    sum = sum + a;
                }
                if(s.charAt(i-1 )== '-') {
                    sum = sum - a ;
                }
            }
            if(max < sum)
            {
                max = sum;
            }
            l--;
        }
        System.out.println(max);

    }
}
