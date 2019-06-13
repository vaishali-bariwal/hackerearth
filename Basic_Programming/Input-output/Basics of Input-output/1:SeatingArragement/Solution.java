import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int n = sc.nextInt();
            int facingseat = 13 - (n % 12);
            if(facingseat == 13)
            {
                facingseat = 1;
                n--;
            }
            facingseat = facingseat + 12 * (n / 12);
            int seattype = facingseat % 6;
            if(seattype==0 ||seattype==1)
            {
                System.out.println(facingseat+" " +"WS");
            }
            else if(seattype ==2 || seattype==5)
            {
                System.out.println(facingseat+" "+"MS");
            }
            else{
                System.out.println(facingseat+" "+"AS");
            }
        }
       
       
    }
}