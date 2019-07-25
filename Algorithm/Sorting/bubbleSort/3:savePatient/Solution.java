
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int p[] = new int[n];
        int v[] = new int[n];
        String[] vaccines = br.readLine().split(" ");
        String[] patients = br.readLine().split(" ");
        for(int i = 0;i < n;i++)
        {
            p[i] = Integer.parseInt(patients[i]);
            v[i] = Integer.parseInt(vaccines[i]);
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0; j < n-1-i;j++)
            {
                if(p[j]>p[j+1])
                {
                    int tp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = p[j];
                }
                if(v[j] > v[j+1])
                {
                    int tp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = tp;
                }
            }
        }
        if(v[0] < p[0])
            System.out.println("No");
        else if(v[n-1] < p[n-1])
            System.out.println("No");
        else
          {  int count=0;
            for(int i = 0;i < n;i++)
             {
                for(int j = 0; j < n;j++)
                {
                    if(p[i] > v[i])
                    {
                        count++;
                        v[i] = 0;
                        break;
                    }
                }
             }
             if(count==n)System.out.println("Yes");
             else System.out.println("No");
            }
    }
}
