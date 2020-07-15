import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name[] = br.readLine().split(" ");
        int n = Integer.parseInt(name[0]);
        int k = Integer.parseInt(name[1]);
        if(k>100)   k=100;
        String[] arr = br.readLine().split(" ");
        int[][] a= new int[k+1][n];
        for(int i = 0;i < arr.length;i++)
        {
             a[0][i] = Integer.parseInt(arr[i]);
             
        }
         for(int i=1;i<k+1;i++)
        {
            a[i][0]= a[i-1][0];
            for(int j=1;j<n;j++)
            {
                a[i][j]=a[i-1][j]|a[i-1][j-1];
            }
        }
        for(int i=0;i<n;i++)
           sb.append(a[k][i]+" ");
        System.out.println(sb);

    }
}
