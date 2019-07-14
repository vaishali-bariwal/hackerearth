import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        // Reading input from STDIN
        int n = Integer.parseInt(br.readLine());
        String[] arrA = br.readLine().split(" ");
        int a[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arrA[i]);
        }
        int m = Integer.parseInt(br.readLine());
        String[] arrC = br.readLine().split(" ");
        int c[] = new int[m];
        for(int i = 0;i < m;i++)
        {
            c[i] = Integer.parseInt(arrC[i]);
        }
        Arrays.sort(a);
        Arrays.sort(c);
        for(int i=1;i<=100;i++)
          {
              int count=0;
              for(int j=0;j<n;j++)
              {
                  for(int k=0;k<m;k++)
                  {
                      if(a[j]+i==c[k])
                      {
                          count++;
                          break;
                      }
                  }
              }
              if(count==n)
              sb.append(i+" ");
          }
        System.out.println(sb);
    }
}