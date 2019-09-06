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
    }
}