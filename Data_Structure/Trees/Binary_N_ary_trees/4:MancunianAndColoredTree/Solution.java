
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nc[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();// Reading input from STDIN
        int n = Integer.parseInt(nc[0]);
        int c = Integer.parseInt(nc[1]);
        int parent[] = new int[n];
        parent[0] = -1;
        String prr[] = br.readLine().split(" ");
        for(int i = 0; i < n-1;i++)
        {
            parent[i+1] = Integer.parseInt(prr[i])-1;
        }
        String clr[] = br.readLine().split(" ");
        int color[] = new int[n];
        for(int i = 0; i < n;i++)
        {
           color[i] = Integer.parseInt(clr[i]);
        }
        for(int i =0;i < n;i++)
        {
           int count = 0;
           int j = i;
           while(parent[j] >= 0)
           {
              if(color[i]==color[parent[j]])
              {
                count = parent[j]+1;
                break;
              }  
              j = parent[j];
           }
           sb.append(count==0?-1+" ":count+" ");
        }
        System.out.println(sb);
    }
}
