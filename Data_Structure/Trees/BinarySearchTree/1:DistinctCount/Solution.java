

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            String nx[] = br.readLine().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);
            HashSet<Integer> hm = new HashSet<Integer>();
            String arr[] = br.readLine().split(" ");
            for(int i = 0;i < n;i++)
            {
                int a = Integer.parseInt(arr[i]);
                hm.add(a);
            }
            if(hm.size()==x) sb.append("Good"+"\n");
            else if(hm.size() < x)  sb.append("Bad"+"\n");
            else  sb.append("Average"+"\n");
        }
        System.out.println(sb);
    }
}
