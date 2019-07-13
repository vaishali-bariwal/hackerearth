
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        int num = 0;
        long  max = 0,min = Integer.MIN_VALUE;
        int a[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            if(a[i] >= 0)
            {
                max += a[i];
                num++;
            }
            else
            {
              if(min < a[i])
              {
                  min =a[i];
              }
            }
        }
        if(max == 0 && min != Integer.MIN_VALUE )
        {
            max = min;
            num = 1;
        }
        System.out.println(max+" "+num);
    }
}
//23556235778205  49954
//23556235778205