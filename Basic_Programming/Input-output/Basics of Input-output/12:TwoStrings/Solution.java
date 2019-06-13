
import java.util.*;

class Solution{
    public static void main(String args[] ) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0 ;k<t;k++)
        {
        boolean f = false;    
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length()!=s2.length()){
            System.out.println("NO");
        }
        else{
            String t1 = s1.toLowerCase();
            String t2 = s2.toLowerCase();// because Arrays.sort will work for only uppercae or lowercase String 
            char[] c1 = t1.toCharArray();// ex : aahjj or GHYJ Arrays.sort will work, not for aghhGH .
            char[] c2 = t2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(String.valueOf(c1).equals(String.valueOf(c2)))
            {
                f = true;
            }
        }
        System.out.println(f ? "YES" : "NO");
            
        }
        

    }
}
