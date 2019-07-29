
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String no = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(no);
        TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
        while(n-- > 0)
        {
            String name = br.readLine(); 
            if(hm.containsKey(name))
            {
                hm.put(name,hm.get(name)+1);
            }
            else
            {
                hm.put(name,1);
            }
        }
        
        for (String name : hm.keySet()) 
        {
            System.out.println(name+" "+hm.get(name));
        }
    }
}
