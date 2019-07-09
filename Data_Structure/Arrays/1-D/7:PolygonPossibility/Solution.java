
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out,true);
        String T = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(T);
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            int maxs = 0 , sum = 0;
            String arr[] = br.readLine().split(" ");
            for(int i = 0;i < n;i++)
            {
                a[i] = Integer.parseInt(arr[i]);
                sum += a[i];
                maxs = Math.max(maxs,a[i]);
            }
            if((sum - maxs) > maxs)
                pw.println("Yes");
            else
                pw.println("No");
        }
}
}
