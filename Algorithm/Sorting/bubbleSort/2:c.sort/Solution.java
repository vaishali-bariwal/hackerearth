
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int a[] =new int[n];
        int ind[] = new int[n];
        boolean f = true;
        int temp =-1;
        for(int i = 0;i < n;i++)
        {
          a[i] = Integer.parseInt(arr[i]);
          ind[i] = i;
          if(a[i] < temp) f = false;
          temp = a[i];
          
        }
        if(f)
        {
             for(int i = 0;i < n;i++)
            {
                System.out.printf(ind[i]+" ");
            }
        }
        else{
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n-1-i;j++)
            {
               if(a[j] > a[j+1])
               {
                   int tp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = tp;
                   int ti = ind[j];
                   ind[j] = ind[j+1];
                   ind[j+1] = ti;
               }
            }
        }
         for(int i = 0;i < n;i++)
        {
            System.out.printf(ind[i]+" ");
        }
        }
    }
}
