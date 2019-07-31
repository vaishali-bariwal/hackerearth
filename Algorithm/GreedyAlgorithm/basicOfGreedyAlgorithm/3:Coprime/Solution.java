
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int cp  = 1;
        for(int i = n-2;i >=1;i--)
        {
            if(gcd(n,i)==1)
            {
                cp = i;
                break;
            }
        }
        System.out.println(cp);
    }
    public static int gcd(int a,int b)
    {
        if (a == 0 || b == 0) 
        return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
              
        return gcd(a, b-a); 
    }
}
