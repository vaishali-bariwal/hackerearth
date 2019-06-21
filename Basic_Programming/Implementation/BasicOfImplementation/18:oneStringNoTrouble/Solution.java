

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();                // Reading input from STDIN
        int n = str.length();
        int count = 1 , max = 1;
        for(int i = 1;i < n;i++)
        {
            if(str.charAt(i) == str.charAt(i - 1)){
                count = 1;
            }
            else{
                count++;
                max = Math.max(max,count);
            }
            
        }
        System.out.println(max);
    }
}
