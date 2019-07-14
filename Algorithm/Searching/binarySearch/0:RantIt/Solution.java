
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        String[] arr = br.readLine().split(" ");
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        int q = Integer.parseInt(br.readLine());
        while(q-- > 0)
        {
            int k = Integer.parseInt(br.readLine());
            sb.append(1 + binarySearch(a,0,n-1,k)+"\n");
        }
        System.out.println(sb);
    }
    public static int binarySearch(int[] a,int low,int high,int key)
    {
       while(low<=high)
       {
         int mid=(low+high)/2;
         if(a[mid]<key)
         {
             low=mid+1;
         }
         else if(a[mid]>key)
         {
             high=mid-1;
         }
         else
         {
             return mid;
         }
       }
       return -1;
    }
}
