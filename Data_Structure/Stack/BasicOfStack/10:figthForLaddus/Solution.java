
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int T = Integer.parseInt(name);
        StringBuilder[] sb = new StringBuilder[T];
        int t = T;
        while(t-- > 0)
        {
            sb[t] = new StringBuilder("");
            StringBuilder su = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            String[] ar = br.readLine().split(" ");
            HashMap<Integer,Integer> hm = new HashMap<>();
            int a[] = new int[n];
            boolean allUnique = true;
            for(int i = 0;i < n;i++)
            {
                a[i] = Integer.parseInt(ar[i]);
                if(!hm.containsKey(a[i]))
                {
                    hm.put(a[i],1);
                    su.append(-1+" ");
                }
                else
                {
                    allUnique = false;
                    hm.put(a[i],hm.get(a[i])+1);
                }
            }
            if(allUnique)
            {
                sb[t] = su;
                continue;
            }
            int fr[] = new int[n];
            for(int i = 0;i < n;i++)
            {
                fr[i] = hm.get(a[i]);
            }
            
            for(int i = 0;i < n-1;i++)
            {
                boolean f = false;
                for(int j = i+1;j < n;j++)
                {
                    if(fr[j] > fr[i])
                    {
                       sb[t].append(a[j]+" ");
                       f = true;
                       break;
                    }
                }
                if(!f) sb[t].append(-1+" ");
            } 
            sb[t].append(-1+" ");
        }
        for(int i = T-1;i >=0;i--)
        {
            System.out.println(sb[i]);
        }
    }
}
