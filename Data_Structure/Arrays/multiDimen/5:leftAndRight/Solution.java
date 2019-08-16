import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int q = Integer.parseInt(name[1]);
        String[] arr = br.readLine().split(" ");
        int[] a= new int[n];
        HashSet<Integer> hm = new  HashSet<Integer>();
        for(int i = 0;i < n;i++)
        {
             a[i] = Integer.parseInt(arr[i]);
             hm.add(a[i]);
        }
        while(q-- > 0)
        {
            String[] yzd = br.readLine().split(" ");
            int y = Integer.parseInt(yzd[0]);
            int z = Integer.parseInt(yzd[1]);
            char d = yzd[2].charAt(0);
            if(!hm.contains(z))
            {
                sb.append(-1+"\n");
            }
            else{
                int count = 0;
                boolean f = false;
                if(d == 'L')
                {
                    int i = y;
                    while(y >= 0)
                    {
                        if(a[y]==z)
                        {
                            f = true;
                            break;
                        }
                        else
                        {
                            y = y-1;
                            count++;
                        }
                    }
                    if(f==false)
                    {
                        y = n-1;
                        while(y > i)
                        {
                           if(a[y]==z)
                            {   
                            f = true;
                            break;
                            } 
                        y = y-1;
                        count++;
                        }
                    }
                    sb.append(count+"\n");
                }
                else
                {
                    int i = y;
                    while(y < n)
                    {
                        if(a[y]==z)
                        {
                            f = true;
                            break;
                        }
                        else
                        {
                            y = y+1;
                            count++;
                        }
                    }
                    if(!f)
                    {
                        y = 0;
                        while(y < i)
                        {
                           if(a[y]==z)
                            {   
                            f = true;
                            break;
                            } 
                        y = y+1;
                        count++;
                        }
                    }
                    sb.append(count+"\n");
                }
            }
        }
        System.out.println(sb);

    }
}
