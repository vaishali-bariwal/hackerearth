import java.util.*;
import java.io.*;
 
class Sol {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int ans = n/a + n/b + n/c - 2*(n/lcm(a,b)) - 2*(n/lcm(a,c)) - 2*(n/lcm(b,c)) + 3*(n/lcm(a,lcm(b,c)));
            System.out.println(ans);
        }
    }
    
    static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
    
    static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}