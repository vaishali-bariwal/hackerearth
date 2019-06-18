import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int a[][] = new int[n][n];
        String[] ijp = br.readLine().split(" ");
        int i = Integer.parseInt(ijp[0]);
        int j = Integer.parseInt(ijp[1]);
        int p = Integer.parseInt(ijp[2]);
        int fill = 0;
        for(int row = 0; row < n;row++)
        {
            for(int col = 0 ;col < n;col++)
            {
                int ji = j - col; int ii = i - row;
                if((p - Math.abs(ji)) <= 0 || (p - Math.abs(ii) <= 0))
                {
                    a[row][col] = 0;  
                }
                else
                {
                   a[row][col] =  (p - Math.abs(ii)) <= (p - Math.abs(ji)) ? (p - Math.abs(ii)) : (p - Math.abs(ji));
                }
                
            }
        }
        for(int row = 0; row < n;row++)
        {
            for(int col = 0 ;col < n;col++)
            {
                System.out.print(a[row][col]);
            }
            System.out.println("");
        }

    }
}
