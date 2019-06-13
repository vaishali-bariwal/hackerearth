import java.util.*;

class Solution{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        long answer = 1;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            answer = (answer * a[i]) % (((int)Math.pow(10,9))+ 7);
        }
        System.out.println(answer);
   
    }
}
