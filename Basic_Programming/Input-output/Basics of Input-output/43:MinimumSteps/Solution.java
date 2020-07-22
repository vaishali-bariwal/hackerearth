import java.util.*;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static int rec(int k,int m,int n){
        if(k>=m)
            return (k-m)/2 + (k-m)%2;
        if( m%n==0 )
            return 1+rec(k,m/n,n);
        int x=(m/n+1)*n;
        return (x - m)/2 + (x - m)%2 + rec(k,x,n);
    }
    public static void main(String args[] ) throws Exception {
        
       Scanner sc = new Scanner(System.in);
       StringBuilder ans=new StringBuilder();
       int t=sc.nextInt();
       while(t-->0){
           int k=sc.nextInt(),m=sc.nextInt(),n=sc.nextInt();
           ans.append(rec(k,m,n)).append("\n");
       }
       System.out.println(ans);
 
    }
}