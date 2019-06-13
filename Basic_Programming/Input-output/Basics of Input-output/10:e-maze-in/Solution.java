
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
     
        Scanner s = new Scanner(System.in);
        String cmd = s.next();
        int i = 0, x = 0,y = 0;
        while(i<cmd.length())
        {
            if(cmd.charAt(i)=='L'){
               x = x - 1; 
            }
            else if(cmd.charAt(i)=='R'){
               x = x + 1; 
            }
            else if(cmd.charAt(i)=='D'){
               y= y - 1; 
            }
            else if(cmd.charAt(i)=='U'){
               y = y + 1; 
            }
            i++;
        }
        System.out.println(x+" "+y);

    }
}
