
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int a[] = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n;i++)
        {
            a[i] = br.readLine().charAt(0) - 96; 
            System.out.println("VAlue "+a[i]);
        }
        for(int i = 0;i < n;i++)
        {
            int temp = a[i];
            int j = i,count = 0;
            while(j > 0 && temp > a[j-1])
            {
                a[j] = a[j-1];
                count++;
                j = j-1;
            }
            a[j] = temp;
            sb.append(count+"\n");
        }
        System.out.print(sb);
    }
}
