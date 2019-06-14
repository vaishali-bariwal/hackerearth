import java.util.*;

class Solution{
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int prime[] = {67,71,73,79,83,89,97,101,103,107,109,113};
        int t = sc.nextInt();
        for(int k =0;k<t;k++){
        int l = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
     
        for(int i = 0 ;i < l;i++)
        {
            int n = s.charAt(i),tp = 0,j = 0;
            //while(n >= prime[j]){ j++;}
            for(int m = 0;m<12;m++)
            {
                if(n<=prime[m])
                {
                    j = m;
                    break;
                }
            }
            if(n <= 67) sb.append((char)67);
            else if(n >= 113) sb.append((char)113);
            else
            {
                int a = n - prime[j-1];
                int b = prime[j] - n;
                if(a<=b) tp = prime[j-1];
                else tp = prime[j];
                sb.append((char)tp);    
            }
                
        }
        System.out.println(sb);
     }
    }
}
