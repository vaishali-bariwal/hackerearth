import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name[]  = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int m = Integer.parseInt(name[1]);
        char a[][] = new char[n][m];
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            String arr = br.readLine();
            for(int j = 0;j < m;j++)
            {
                a[i][j] = arr.charAt(j);
            }
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m-3;j++)
            {
                if(a[i][j]=='s'&&a[i][j+1]=='a'&&a[i][j+2]=='b'&&a[i][j+3]=='a')
                {
                        count++;
                }
            }
        }
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j < n-3;j++)
            {
                if(a[j][i]=='s'&&a[j+1][i]=='a'&&a[j+2][i]=='b'&&a[j+3][i]=='a')
                {
                        count++;
                }
            }
        }
        for(int i = 0;i < n-3;i++)
        {
            for(int j = 0;j < m-3;j++)
            {
                if(a[i][j]=='s'&&a[i+1][j+1]=='a'&&a[i+2][j+2]=='b'&&a[i+3][j+3]=='a')
                {
                        count++;
                }
            }
        }
        for(int i = n-1; i > 2;i--)
        {
            for(int j = 0;j < m-3;j++)
            {
                if(a[i][j]=='s'&&a[i-1][j+1]=='a'&&a[i-2][j+2]=='b'&&a[i-3][j+3]=='a')
                {
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
