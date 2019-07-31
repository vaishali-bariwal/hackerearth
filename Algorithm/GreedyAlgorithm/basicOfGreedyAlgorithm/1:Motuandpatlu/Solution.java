import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int T = Integer.parseInt(name);
        while(T-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int a[] =new int[n];
            for(int i =0; i < n;i++)
            {
                a[i] = Integer.parseInt(arr[i]);
            }
            if(n==1)
            {
                System.out.println(1+" "+0);
                System.out.println("Motu");
                continue;
            }
            long suml=0,sumr=0;
            int l=0,r=n-1,mc=0,mp=0;
            while(l<=r)
            {
                for(;l<=r && suml<=2*sumr;l++)
                {
                    suml+=a[l];
                    mc++;
                }
                for(;r>=l && 2*sumr<suml;r--)
                {
                    sumr+=a[r];
                    mp++;
                    
                }
            }
            System.out.println(mc+" "+mp);
            if(mc>mp)
            System.out.println("Motu");
            else if(mc<mp)
            System.out.println("Patlu");
            else
            System.out.println("Tie");
        }
    }
}
