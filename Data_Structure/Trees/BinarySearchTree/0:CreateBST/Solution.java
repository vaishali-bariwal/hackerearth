import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
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
         int q = Integer.parseInt(br.readLine());
         node pre = find(start,q);
         preorder(pre);
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
    public static node find(node root,int q)
    {
        if(root!=null && root.data == q)
        {
            return root;
        }
        else
        {
            while(root!=null)
            {
               if (q < root.data)
                root = root.left;
               else if(q > root.data)
                root = root.right; 
                else
                return root;
            }
        }
        return root;
    }
    public static void preorder(node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);    //Printf root->data
            preorder(root.left);    //Go to left subtree
            preorder(root.right);     //Go to right subtree
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
