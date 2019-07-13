import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            sum += a[i];
        }
        int q = Integer.parseInt(br.readLine());
        while(q-- > 0)
        {
            int temp = 0;
            int target = Integer.parseInt(br.readLine());
            if(target == sum)
                sb.append(n+"\n");
            else if(target > sum)
                sb.append(-1+"\n");
            else
            {
                for(int i = 0;i < n;i++)
                {
                    temp += a[i];
                    if(temp >= target)
                    {
                        sb.append(i+1+"\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
