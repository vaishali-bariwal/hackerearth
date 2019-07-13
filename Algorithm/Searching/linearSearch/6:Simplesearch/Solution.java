
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a[] = br.readLine().split(" ");
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i < n;i++)
        {
            hm.put(Integer.parseInt(a[i]),i);
        }
        int k = Integer.parseInt(br.readLine());
        System.out.println(hm.get(k));
    }
}
