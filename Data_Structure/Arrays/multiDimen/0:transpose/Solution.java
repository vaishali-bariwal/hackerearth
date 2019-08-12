import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int m = Integer.parseInt(name[1]);
        int rev[][] = new int[m][n];
        for(int i = 0 ;i < n;i++)
        {
            String[] a = br.readLine().split(" ");
            for(int j = 0;j < m;j++)
            {
                rev[j][i] = Integer.parseInt(a[j]);
            }
        }
         for(int i = 0 ;i < m;i++)
        {
            for(int j = 0;j < n;j++)
            {
               System.out.print(rev[i][j]+" "); 
            }
            System.out.println("");
        }
    }
}
