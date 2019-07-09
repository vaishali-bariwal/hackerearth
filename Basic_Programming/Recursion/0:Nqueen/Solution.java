import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
 
 
import java.util.*;
 
 
 
class TestClass {
    
    static int N;
    
    static int isAttacked(int[][] b,int x1,int y1){
        //System.out.println("hello");
        for(int i=0;i<N;i++){
            
            if((b[i][y1]==1) || (b[x1][i]==1))
                return 1;
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i+j == x1+y1){
                    if (b[i][j]==1)
                        return 1;
                }
                if(i-j == x1-y1){
                    if (b[i][j]==1)
                        return 1;
                }
            }
        }
        return 0;
    }
    
    static int nQueens(int[][] b,int n){
        if(n==0)
            return 1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(isAttacked(b,i,j)==0)
                {    
                    b[i][j]=1;
                    if (nQueens(b,n-1)==1)
                        return 1;
                    b[i][j]=0;
                }
            }
        }
        return 0;
    }
    
    
    public static void main(String args[] ) throws Exception {
        
        PrintWriter pw=new PrintWriter(System.out,true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1 = br.readLine();                
        int n=Integer.parseInt(n1);
        N=n;
        
        
        int[][] b=new int[n][n];
        
        if(nQueens(b,n)==1)
        {
        pw.println("YES");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                pw.print(b[i][j]+" ");
            }
            pw.println("");
        }
        }
        else
            pw.println("NO");
    }
}