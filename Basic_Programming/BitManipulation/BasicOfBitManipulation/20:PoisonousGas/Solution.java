
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            String ar[] = br.readLine().split(" ");
            int sum = 0;
            int a[] = new int[n];
            for(int i = 0;i < n ;i++)
            {
                a[i] = Integer.parseInt(ar[i]);
                if(a[i] > 0) sum+=a[i];
            }
            if(powerOfTwo(sum))
                sb.append("Yes"+"\n");
            else
                sb.append("No"+"\n");
        }
        System.out.println(sb);
    }
    public static boolean powerOfTwo(int n)
    {
        if(n > 0 && ((n-1)&n) == 0) return true;
        else return false;
    }
}
