import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nmk[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(nmk[0]);
        int m = Integer.parseInt(nmk[1]);
        int k = Integer.parseInt(nmk[2]);
        int a[][] = new int[n][m];
         int b[][] = new int[n+1][m+1];
        for(int i =0;i < n;i++)
        {
            String ar[] = br.readLine().split(" ");
            for(int j = 0;j < m;j++)
            {
                a[i][j] = Integer.parseInt(ar[j]);
            }
        }
          int res = 0;
        for(int i=0;i<n && res!=-1;i++) {
          for(int j=0;j<m && res!=-1;j++) {
            a[i][j] ^= b[i][j];
            b[i][j+1] ^= b[i][j];
            b[i+1][j] ^= b[i][j];
            b[i+1][j+1] ^= b[i][j];
 
            if(a[i][j]==0 && i+k-1<n && j+k-1<m) {
              res++;
              a[i][j] = 1;
              b[i+1][j] ^= 1;
              b[i][j+1] ^= 1;
              b[i+1][j+1]^=1;
              
              b[i+k][j]^=1;
              b[i][j+k]^=1;
              b[i+k][j+k]^=1;
            }
            else if(a[i][j]==0){
              res = -1;
            }
        }
        }
 
		System.out.print(res);

    }
}
