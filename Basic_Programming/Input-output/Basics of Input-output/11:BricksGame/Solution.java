
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean motu = false;
        int sum = n , i = 1;
        while(sum <= n)
        {
            if(sum <= i){motu = false; break;}
            sum = sum - i;
            if(sum <= i * 2){motu = true; break;}
            sum = sum - (i * 2);
            i++;
        }
        System.out.println(motu ? "Motu" : "Patlu");

    }
}
