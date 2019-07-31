
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN
        StringBuilder sb = new StringBuilder();
        int n  = s.length();
        int i = 0;
        char ch =' ';
        while(i < n-1)
        {
            if(s.charAt(i)=='?')
            {
               if(s.charAt(i+1) != 'a' && ch != 'a')
               {
                   sb.append('a');
                   ch = 'a';
               }
               else
               {
                  sb.append('b');
                   ch = 'b'; 
               }
            }
            else
            {
                sb.append(s.charAt(i));
                ch = s.charAt(i);
            }
            i++;
        }
        if(s.charAt(i)=='?')sb.append(ch=='a'?'b':'a');
        else  sb.append(s.charAt(i));
        System.out.println(sb);
    }
}//?a?bb?aba
//+babbbbaba
//babbbaaba