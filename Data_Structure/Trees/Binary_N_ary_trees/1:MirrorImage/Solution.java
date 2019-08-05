import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        TestClass tc = new TestClass();
        tc.solve();
    }
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int q = Integer.parseInt(in[1]);
        Node root = new Node(1);
        int i;
        for(i=1;i<n;i++){
            in = br.readLine().split(" ");
            int parent = Integer.parseInt(in[0]);
            int child = Integer.parseInt(in[1]);
            String dir = in[2];
            insert(root,parent,child,dir);
        }
        for(i=0;i<q;i++){
            int val = Integer.parseInt(br.readLine());
            System.out.println(findMirror(root,val));
        }
        
    }
    
    int findMirror(Node node, int val){
        if(val == 1) return 1;
        return mirrorUtil(node.left,node.right,val);
    }
    
    int mirrorUtil(Node left, Node right, int val){
        if(left==null && right==null){
            return -1;    
        }
        if(left != null && right != null){
            if(left.data == val){
                return right.data;
            }else if(right.data == val){
                return left.data;
            }else{
                int a = mirrorUtil(left.left,right.right,val);
                int b = mirrorUtil(left.right,right.left,val);
                return (a!=-1)?a:b;
            }
        }
        if(left!=null){
            return findMirror(left,val);
        }else{
            return findMirror(right,val);
        }
    }
    
    void insert(Node node, int parent, int child, String dir){
        if(node == null) return;
        if(node.data == parent){
            switch(dir){
                case "R":
                    node.right = new Node(child);
                    break;
                case "L":
                    node.left = new Node(child);
                    break;
            }
        }
        insert(node.left,parent,child,dir);
        insert(node.right,parent,child,dir);
    }
    
}