import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String[] arr = br.readLine().split(" ");
        int a ;
        node start = null;
        for(int i = 0;i < n;i++)
        {
             a = Integer.parseInt(arr[i]);
             start = insert(start,a);
        }
        System.out.println(height(start));
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
    public static int height(node root)
    {
        if(root==null)
        {
            return 0;    //Go to right subtree
        }
        int lh = height(root.left);
        int rh = height(root.right);
        
        if(lh>rh)
         return lh+1;
        else
         return rh+1;
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
