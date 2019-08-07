
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static ArrayList<Integer> al[];
    public static int n;
        
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        n = Integer.parseInt(name);
        al = new ArrayList[n+1];
        for(int i =0;i <= n;i++)
        {
            al[i] = new ArrayList<Integer>();
        }
        for(int i =0;i < n-1;i++)
        {
            String uv[] = br.readLine().split(" ");  
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);
            al[u].add(v);
            al[v].add(u);
        }
        int first_node = dfs(1);
        int second_node = dfs(first_node);
        System.out.println(first_node+" "+second_node);
    }
    public static int dfs(int root)
    {
        boolean vi[] = new boolean[n+1];
        LinkedList<Integer>  list = new LinkedList<Integer>();
        int d = -1;
        list.add(root);
        while(!list.isEmpty())
        {
            int node = list.poll();
            vi[node] = true;
            boolean flag = false;
            for(int i : al[node])
            {
                if(!vi[i])
                {
                    list.add(i);
                    if(!flag)
                    {
                        d = i;
                        flag = true;
                    }
                }
            } 
            flag = false;
        }
        return d;
    }
}
