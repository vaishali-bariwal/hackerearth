import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());                // Reading input from STDIN
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());  
            int a[][] = new int[n][n];
            for(int i = 0;i < n;i++)
            {
                String ar = br.readLine();
                for(int j = 0;j < n;j++)
                {
                    a[i][j] =  Character.getNumericValue(ar.charAt(j));
                }
            }
            boolean flag = true;
            for(int i = 0;i < n;i++)
            {
                for(int j = 0;j < n;j++)
                {
                    if(a[i][j]!=a[i][n-j-1] || a[i][j]!=a[n-i-1][j])
                    {
                        flag = false;
                        break;
                    }
                }
            }
            sb.append(flag?"YES"+"\n":"NO"+"\n");
        }
        System.out.println(sb);

    }
}
