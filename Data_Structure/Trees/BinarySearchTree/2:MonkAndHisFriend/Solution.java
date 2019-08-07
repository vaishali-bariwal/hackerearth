import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            String name[] = br.readLine().split(" ");               // Reading input from STDIN
            int n = Integer.parseInt(name[0]);
            int m = Integer.parseInt(name[1]);
            String[] arr = br.readLine().split(" ");
            node start = null;
            for(int i = 0;i < n;i++)
            {
                 long a = Long.parseLong(arr[i]);
                 start = insert(start,a);
            }
            for(int i = n;i < m+n;i++)
            {
             long q = Long.parseLong(arr[i]);
             node pre = find(start,q);
             if(pre==null)
             {
                 insert(start,q);
                 sb.append("NO"+"\n");
             }
             else
                sb.append("YES"+"\n");
            }
        }
        System.out.println(sb);
    }
    public static node insert(node root,long n)
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
    public static node find(node root,long q)
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
