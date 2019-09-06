import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String s = br.readLine();
        String t = br.readLine();
        char ch[] = new char[n];
        int days = 0;
        String str2 = String.valueOf(ch);
        for(int i = 0;i < n;i++)
        {
            char c1 =s.charAt(i);
            char c2 = t.charAt(i);
            if(c1==c2)
            {
                continue;
            }
            else
            {
              int a = c1;
              int b  = c2;
              int diff = Math.abs(a-b);
              if(a > b)
              {
                    diff = (90-a)+(b-64);  
              }
              if(diff >= 13)
              {
                  diff = diff - 13 ;
                  days++;
              }
              days += diff;
            }
        }
        System.out.println(days);

    }
}
