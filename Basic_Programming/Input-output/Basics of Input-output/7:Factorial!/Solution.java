import java.util.*;

class Solution{
    public static void main(String args[] ) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for(int i = 1;i <= n;i++)
        {
            f = f * i;
        }
        System.out.println(f);
    }
}
