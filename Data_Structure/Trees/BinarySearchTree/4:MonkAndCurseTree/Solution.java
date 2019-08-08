import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static int max = 0;
    public static boolean f = false; 
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String[] arr = br.readLine().split(" ");
        node start = null;
        for(int i = 0;i < n;i++)
        {
             int a = Integer.parseInt(arr[i]);
             start = insert(start,a);
        }
         String[] xy = br.readLine().split(" ");
         int root = Integer.parseInt(arr[0]);
         int x = Integer.parseInt(xy[0]);
         int y = Integer.parseInt(xy[1]);
         int mx = Math.max(x,y);
         int mn = Math.min(x,y); 
         inorder(start,mn,mx);
         System.out.println(max);
    }
    public static node insert(node root,int n)
    {
        if(root==null)
        {
            return new node(n);
        }
        else
        {
            if (n <= root.data)
                root.left = insert(root.left,n);
            else
                root.right = insert(root.right, n);
            return root;
        }
    }
    public static void inorder(node root,int l,int r)
    {
        if(root!=null)
        {
            if(root.data < l)
            {
                 inorder(root.right,l,r);
            }
            else if(root.data > r)
            {
                inorder(root.left,l,r);
            }
            else
            {
               node p = root;
               max = root.data;
               while(p != null && p.data != r)
               {
                   if(p.data > r)
                   {
                      max = Math.max(max,p.data); 
                      p = p.left;
                   }
                   else
                   {
                       p = p.right;
                   }
               }
               max = Math.max(max,r); 
            }
            
        }
    }
  
}
class node
{
    public node left,right;
    public int data;
    node()
    {}
    node(int n)
    {
        this.data =n;
        this.left = null;
        this.right = null;
    }
}
