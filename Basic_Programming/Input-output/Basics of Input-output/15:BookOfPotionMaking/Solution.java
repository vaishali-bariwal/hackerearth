
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), sum = 0 ,i = 10;
        boolean flag = true;
        if(n/1000000000 >= 1 && n/1000000000 < 10)
        {
            while(n > 0)
            {
                sum = sum + ((n%10)*i);
                n = n/10;
                i--;
            }
            if(sum % 11 != 0)
            {
                flag = false;
            }
        }
        else
        {
            flag = false;
        }
       
        System.out.println(flag ? "Legal ISBN" : "Illegal ISBN");
    }
}
