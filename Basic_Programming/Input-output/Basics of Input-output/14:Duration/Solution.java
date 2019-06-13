
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
     
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(),hh =0 ,mm =0;
        for(int i = 0;i < t;i++)
        {
            int sh = sc.nextInt();
            int sm = sc.nextInt();
            int eh = sc.nextInt();
            int em = sc.nextInt();
            if(em < sm)
            {
                em = em + 60;
                eh--;
                mm = em - sm;
                hh = eh - sh;
            }
            else
            {
                mm = em - sm;
                hh = eh - sh;
            }
            System.out.println(hh+" "+mm);
            
        }

    }
}
