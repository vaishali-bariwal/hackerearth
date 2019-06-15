import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int a[] = {0,0,0,0,0,0,0,0,0,0};
        int n = name.length();
        for(int i = 0;i < n;i++)
        {
            if(Character.isDigit(name.charAt(i)))
            {
                a[Character.getNumericValue(name.charAt(i))] = a[Character.getNumericValue(name.charAt(i))] + 1;
            }
        }
        for(int i = 0;i < 10;i++)
        {
            System.out.println(i+" "+a[i]);
        }

    }
}
