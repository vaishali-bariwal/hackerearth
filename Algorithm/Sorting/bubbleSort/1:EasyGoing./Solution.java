
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            String name[] = br.readLine().split(" ");                // Reading input from STDIN
            int n = Integer.parseInt(name[0]);
            int m = Integer.parseInt(name[1]);
            int no = n-m;
            String[] arr = br.readLine().split(" ");
            int a[] =new int[n];
            for(int i = 0;i < n;i++)
            {
                a[i] = Integer.parseInt(arr[i]);
            }
            int sum = 0,sum2 =0;
           for(int i = 0;i < n;i++)
           {
               for(int j = 0;j < n-1-i;j++)
               {
                   if(a[j] > a[j+1])
                   {
                       int tp = a[j];
                       a[j] = a[j+1];
                       a[j+1] = tp;
                      
                   }
               }
           }
           for(int i = 0;i < no;i++)
            {
                sum2 += a[i];
            }
            for(int i = n-1;i >= m;i--)
            {
                sum += a[i];
            }
            sb.append(sum-sum2+"\n");
        }
        System.out.println(sb);

    }
}
