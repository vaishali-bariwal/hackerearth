import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
     public static int kthnNode = 0;
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n =  Integer.parseInt(name[0]);
        int k = Integer.parseInt(name[1]);
        node start = null;
        String arr[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
        {
            start = insert(start,Integer.parseInt(arr[i]));
            //System.out.println("kii");
        }
        preorder(start);
        kthlargest(start,k,0);
        System.out.println("kth Largest = "+kthnNode);
    }
    public static void preorder(node root) 
    {
        if(root!=null)
        {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }   
    }
    public static void kthlargest(node root , int k ,int c)
    {
        if(root == null || c >= k)
        return;
        c = c+1;
        kthlargest(root.right, k,c);
        if(c==k)
        {
            kthnNode = root.data;
        }
        c=c+1;
        kthlargest(root.left, k, c);
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