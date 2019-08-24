import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> hm  = new HashMap<>();
        HashMap<String,Integer> gen  = new HashMap<>();
        String[] arr = br.readLine().split(" ");
        int T= 0;
        while(!arr[0].equalsIgnoreCase("STOP"))
        {
            int t = Integer.parseInt(arr[1]);
            if(!gen.containsKey(arr[0])) gen.put(arr[0], 1);
            String[] str = br.readLine().split(" ");
            if(str[0].equalsIgnoreCase("STOP")){T = Integer.parseInt(str[1]);break;}
            int i = 0;
            while(i < t)
            {
                hm.put(str[i],arr[0]);
                gen.put(arr[0],gen.get(arr[0])+1);
                i++;
            }
            arr = br.readLine().split(" ");
            T = Integer.parseInt(arr[1]);
        }
        while(T-- > 0)
        {
            String[]  test  = br.readLine().split(" ");
            String s1 = test[0];
            String s2 = test[1];
            if(hm.get(s2).equalsIgnoreCase(s1))
            {
             System.out.println("YES "+Math.abs(gen.get(s1)-gen.get(s2)));
            }
            else{
                System.out.println("NO");
            }
        }
    }
}