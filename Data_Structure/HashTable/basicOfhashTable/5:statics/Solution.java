import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        HashMap<String,Integer> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        int max = -1;
        String s = "";
        while(n-- > 0)
        {
            String xy[] = br.readLine().split(" ");
            String p = xy[1];
            if(!hs.contains(xy[0]))
            {
                hs.add(xy[0]);
                if(hm.containsKey(p))
                {
                    hm.put(p,hm.get(p)+1);
                }
                else
                {
                    hm.put(p,1);
                }
            }  
            if(hm.containsKey(p) && max <= hm.get(p))
                {max = hm.get(p);
                s = p; 
                }

        }
        System.out.println(s);
        System.out.println(hm.get("football") ==null ? 0 : hm.get("football"));
    }
}