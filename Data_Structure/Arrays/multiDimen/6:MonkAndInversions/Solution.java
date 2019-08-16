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
            int temp = 0,count = 0;
            int[][] a = new int[n][n];
            for(int i = 0;i < n;i++)
            {
                String[] arr = br.readLine().split(" ");
                for(int j = 0;j < n;j++)
                {
                 a[i][j] = Integer.parseInt(arr[j]);
                }
            }
            for(int i=0; i<n ; i++){
                for(int j=0; j<n; j++) {
                    for(int k = i; k<n; k++) {
                        for(int l=j; l<n; l++) {
                            if(a[k][l] < a[i][j]) {
                                count++;
                            }
                        }
                    }
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
c