
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        for(int i =0;i < n;i++)
        {
            String[] value = br.readLine().split(" ");
            int k = Integer.parseInt(value[0]);
            String s = value[1];
            hm.put(k,s);
        }
        int q = Integer.parseInt( br.readLine());
        for(int i =0;i < q;i++)
        {
            int l = Integer.parseInt( br.readLine());
            System.out.println(hm.get(l));
        }

    }
}
