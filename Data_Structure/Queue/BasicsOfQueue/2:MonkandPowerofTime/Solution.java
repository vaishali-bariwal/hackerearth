
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int c[] = new int[n];
        int o[] = new int[n ];
        int front = 0,rear = n-1;
        String call[] = br.readLine().split(" ");
        String order[] = br.readLine().split(" ");
        for(int i = 0;i < n;i++)
        {
            c[i] = Integer.parseInt(call[i]);
            o[i] = Integer.parseInt(order[i]);
        }
        int count=0;
        for(int i = 0;i < n;)
        {
            if(o[i]==c[i])
            {
                count++;
                i++;
                
            }
            else
            {
                int temp = c[i];
                for(int j = i;j < n-1;j++)
                {
                    c[j] = c[j+1];
                }
                c[n-1] = temp;
                count++;
            }
        
        }
        System.out.println(count);
    }
    
}
