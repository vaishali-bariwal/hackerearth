import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String nq[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String arr[] = br.readLine().split(" ");
        int a[] = new int[n];
        ArrayList<Long> list = new ArrayList<>();
        int l = 1,c = 0;
        long sum = 0;
        for(int i =0; i< n;i++)
        {
             a[i] = Integer.parseInt(arr[i]);
             c++;
             if((int)Math.pow(2,l)==c)
             {
                 list.add(sum);
                 l++;
                 sum = 0;
             }
             sum += a[i];
        }list.add(sum);
           
        while(q-- > 0)
        {
            String query[] = br.readLine().split(" ");
            if(query.length == 3)
            {
                if(Integer.parseInt(query[0]) == 1)
                {
                    int xth = Integer.parseInt(query[1]);
                    int lvl = Integer.parseInt(query[2]);
                    int i = (int)Math.pow(2,lvl-1) - 2;
                    sb.append(a[i+xth]+"\n");
                }
                else
                {
                    int lvl1 = Integer.parseInt(query[1]);
                    int lvl2 = Integer.parseInt(query[2]);
                     sum = 0;
                    lvl1--;
                    for(int i = lvl1 ;i < lvl2;i++)
                    {
                        sum += list.get(i);
                    }
                    sb.append(sum+"\n");
                }
                
            }
            else
            {
                
                int xth = Integer.parseInt(query[1]);
                int lvl = Integer.parseInt(query[2]);
                int val = Integer.parseInt(query[3]);
                int i = (int)Math.pow(2,lvl-1) - 2;
                int oldVal = a[i+xth];
                a[i+xth] = val;
                list.set(lvl-1, list.get(lvl-1)+(val-oldVal));
            }
       }
        System.out.println(sb);        

    }
}
