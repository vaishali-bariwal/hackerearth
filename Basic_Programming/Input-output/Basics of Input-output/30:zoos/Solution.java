import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myStr = br.readLine();                
        int i = myStr.indexOf("o");
        int l = myStr.length();
        int no_of_zs = i;
        int no_of_os = l - no_of_zs;
        if((no_of_zs*2)==no_of_os)
        {
        System.out.println("Yes");
        }
        else
        {System.out.println("No");}

    }
  }