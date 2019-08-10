import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
     public static long a[] ;
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        long l =  Long.parseLong(name[0]);
        long s = Long.parseLong(name[1]);
        node start = null;
        long sum = 0 , k = 1;
        int  n = (int)Math.pow(2,l) - 1;
        a = new long[n+1];
        if(l==1){ start = insert(start,s+1,1);}
        else{
            while(sum < s)
            {
                k++;
                sum = k+k + (long)Math.pow(2,l-1) -1;
                sum = (n*sum)/2;
            }
             long max = k + (long)Math.pow(2,l-1) -1;
             start = insert(start,k+1,1);
             long mx  = k; 
             for(int i = 0;i < n-1;i++ )
             {
                 k = k==max+1?mx:k;
                 start = insert(start,k,1);
                 k++;
             }
        }
         long q = Integer.parseInt(br.readLine());
         while(q-- > 0)
         {
            String tv[] = br.readLine().split(" ");
            long t = Long.parseLong(tv[0]);
            int v = Integer.parseInt(tv[1]);
            if(t==0)
            {
               sb.append(find(start,v)+"\n");
            }
            else
            {
                sb.append(a[v]+"\n");
            }
         }
         //for(int i = 1;i < n;i++ ){System.out.println("i  "+i+" "+a[i]);}
         System.out.println(sb);
    }
    public static node insert(node root,long n,int i)
    {
        if(root==null)
        {
            a[i] = n;
            return new node(n);
        }
        else
        {
            if (n <= root.data)
                root.left = insert(root.left,n,i*2);
            else
                root.right = insert(root.right, n,i*2+1);
            return root;
        }
    }
    public static StringBuilder find(node root,long q)
    {
        if(root!=null && root.data == q)
        {
            return new StringBuilder("root");
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            while(root!=null)
            {
               if (q < root.data)
                {root = root.left;
                 sb.append('l');}
               else if(q > root.data)
               { root = root.right;
                 sb.append('r');}
                else
                return sb;
            } return sb;
        }
    }
}
class node
{
    public node left,right;
    public long data;
    node()
    {}
    node(long n)
    {
        this.data =n;
        this.left = null;
        this.right = null;
    }
}
/*1523061159
1523061159
root
root
1523061159*/