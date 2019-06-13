import java.util.*;

class Solution{
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        String str = s.next();                 
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
      

    }
}