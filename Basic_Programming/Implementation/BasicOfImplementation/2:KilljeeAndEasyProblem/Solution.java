import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static ArrayList<Integer> edgeList[];// edge array for each node ex : edgeList[i] contain all those nodes which are connected to i; 
    public static ArrayList<Integer> finalArray;//final array
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int m = Integer.parseInt(name[1]);
        edgeList = new ArrayList[n + 1];
        for(int i=1;i<=n;i++)
            edgeList[i] = new ArrayList<Integer>();
        finalArray = new ArrayList<Integer>();
        while(m > 0)
        {
            String[] edge = br.readLine().split(" ");
            int x = Integer.parseInt(edge[0]);
            int y = Integer.parseInt(edge[1]);
            edgeList[x].add(y);
            edgeList[y].add(x);
            m--;
        }
        Dfs(1,new boolean[n+1]);// to create finalArray
        System.out.println(finalArray.size());
        for(int i : finalArray)
            System.out.print(i+" ");
    }
    public static void Dfs(int u,boolean visited[])
    {
        visited[u] = true;
        finalArray.add(u);
        for(int v : edgeList[u]){
            if(!visited[v])
            {
                Dfs(v,visited);
                finalArray.add(u);
            }
        }
    }
}
