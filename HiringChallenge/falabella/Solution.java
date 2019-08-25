import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] temp = br.readLine().split(" ");
            int X = Integer.parseInt(temp[0]);
            int A = Integer.parseInt(temp[1]);
            int B = Integer.parseInt(temp[2]);
            long C = Long.parseLong(temp[3]);
            if(C==1)System.out.println(X);
            else {
                long out_ = solve(A, X, C, B);
                System.out.println(out_);}
         }

         wr.close();
         br.close();
    }
    static long solve(int a, int x, long c, int b){
        // Write your code here
        int count = 0;
        long n = c/2;
        n = n * x;
        long t = 0;
        while(count!=c)
        {
            int i = x;
            count += n/i;
            int prev = i;
            while(n >= i)
            {
                i = (a*prev) + b;
                prev = i;
                count += n/i;
            }
            if(count>=c) {t = n;break;}
            count=0;
            n++;
            
        }
        return t;
    
    }
}