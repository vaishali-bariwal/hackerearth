
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = br.readLine().split(" ");        
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int arr[][] = new int[n][m];
        for(int i = 0;i < n;i++)
        {
            String ij[] = br.readLine().split(" "); 
            for(int j = 0;j < m;j++)
            {
                arr[i][j] = Integer.parseInt(ij[j]);
            }
        }
        int grid[][][]=new int[n][m][5];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                grid[i][j][0]=arr[i][j];
                grid[i][j][1]=arr[i-1][j];
                grid[i][j][2]=arr[i][j-1];
                grid[i][j][3]=arr[i+1][j];
                grid[i][j][4]=arr[i][j+1];
            }
        }
        int ans = findMax(n,m,grid);
        System.out.println(ans);
    }
    public static int findMax(int n,int m,int grid[][][])
    {
        int ans=-1, i=1, j=1 , a=1;
        for( i=1;i<n-1;i++){
            for( j=1;j<m-1;j++){
               for( a=1;a<n-1;a++){
                   for(int b=1;b<m-1;b++){
                       if(i!=a&&j!=b){
                       int value=grid[a][b][0]*grid[i][j][0]+grid[a][b][1]*grid[i][j][1]+
                          grid[a][b][2]*grid[i][j][2]+grid[a][b][3]*grid[i][j][3]+grid[a][b][4]*
                          grid[i][j][4];
                        
                        if(value>ans){
                            ans=value;
                        }}
                       
                   }
               } 
                
            }
        }
        return ans;
    }
}
