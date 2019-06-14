
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            y[i] = sc.nextInt();
            System.out.println(y[i] >= x ? "YES" : "NO");
        }

    }
}
