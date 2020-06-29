import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int n = Integer.parseInt(name);
        String[] arr = br.readLine().split(" ");
        int a =0;
        Map<Integer,Boolean> m = new TreeMap<Integer,Boolean>();
       
        for(int i = 0;i < n;i++)
        {
            a = Integer.parseInt(arr[i]);
            if(m.containsKey(a))
            {
                m.put(a, false);
            }
            else
            {
                m.put(a, true);
            }      
        }
        for (Integer i : m.keySet()) {
           if(m.get(i))
                System.out.print(i+" ");
            
        }

    }
}
