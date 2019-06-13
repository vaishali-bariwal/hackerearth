
import java.util.*;

class solution{
    public static void main(String args[] ) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        String s= sc.next();  
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else
            {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb.toString());
    }
}
