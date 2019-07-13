
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out,true);
        int n = Integer.parseInt(br.readLine().trim());
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        String arr[] = br.readLine().split(" ");
        int a[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i], 1);
            }
            else
            {
                hm.put(a[i], hm.get(a[i])+1);
            }
        }
        int k = Integer.parseInt(br.readLine());
        int min = 100002;
        for (int i : hm.keySet()) 
        {
            if(k==hm.get(i)) 
            {
                if(i < min)
                {
                    min = i;
                }
            }  
        }
        pw.println(min);
    }
}
