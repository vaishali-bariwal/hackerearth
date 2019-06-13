
import java.util.*;

class Solution{
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int t = sc.nextInt();
        int a[][] = new int[t][2];
        for(int j =0;j<t;j++)
        {
            for(int k =0;k<2;k++)
            {
                a[j][k] = sc.nextInt();
            }
            if(l <= a[j][0] && l <= a[j][1])
            {
                if(a[j][0]==a[j][1])
                {
                    System.out.println("ACCEPTED");
                }
                else{
                System.out.println("CROP IT");
                }
            }
            else if (l > a[j][0] || l >a[j][1])
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                 System.out.println("ACCEPTED");
            }
        }

    }
}
