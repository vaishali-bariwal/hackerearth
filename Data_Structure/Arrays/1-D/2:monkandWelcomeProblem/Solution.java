

import java.util.*;

class TestClass {
       public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            b[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
                
            
        }
        for(int k=0;k<c.length;k++)
        {
            System.out.print(c[k]+" ");
        }
        
 
    }
}
