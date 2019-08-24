import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character,Integer> hm  = new HashMap<>();
        String[] arr = br.readLine().split(" ");
        String s1 = arr[0].toLowerCase();
        String s2 = arr[1].toLowerCase();
        if(s1.length()!=s2.length())
        {
            System.out.println("false");
        }
        else
        {
            boolean flag = true;
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int i = 0; i < s1.length(); i++) {
                if(c1[i]!=c2[i])
                {
                    
                    flag = false;
                    break;
                }
            }
            System.out.println(flag?"true":"false");
        }
    }
}