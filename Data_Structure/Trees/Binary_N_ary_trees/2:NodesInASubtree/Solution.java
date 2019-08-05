
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {

    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n  = Integer.parseInt(name[0]);
        int q = Integer.parseInt(name[1]);
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        boolean v[] = new boolean[n+1];
        int count[][] = new int[n+1][26];
        ArrayList<Integer>[] al = new ArrayList[n+1]; 
        for (int i = 1; i <= n; i++) { 
            al[i] = new ArrayList<Integer>(); 
        }
        for(int i =0; i< n-1;i++)
        {
            String uv[] = br.readLine().split(" ");   
            int u = Integer.parseInt(uv[0]);
            int v1 = Integer.parseInt(uv[1]);
            al[u].add(v1);
            al[v1].add(u);
        }
            v[0] =true;v[1] =true;
            countdfs(v,al,1,s,count);
            while(q-->0)
            {
                String uc[] = br.readLine().split(" "); 
                int u = Integer.parseInt(uc[0]);
                char c = uc[1].charAt(0);
                sb.append(count[u][c-'a']+"\n");
            }
        System.out.println(sb);
    }
    public static void countdfs(boolean v[],ArrayList<Integer>[] al ,int u,String s,int count[][])
    {
        for(int i : al[u]){
            if(!v[i]) {
                v[i] = true;
                countdfs(v,al,i,s,count);
            }
        }
        count[u][s.charAt(u-1)-'a'] += 1;
        for(int j : al[u]){
            for(int i=0;i<26;i++) count[u][i] += count[j][i];
        }
    }
}
