import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] str = br.readLine().split(" ");
         int n = Integer.parseInt(str[0]);
         long k = Long.parseLong(str[1]);
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         long out_ = Solve(k, arr,n);
         System.out.println(out_);

         wr.close();
         br.close();
    }
        static long Solve(long k, int[] arr,int n)
    {
        int j = 0;
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]>0)
            {
                while(i-j>k)
                {
                    ++j;
                }
                go:
                while(arr[i]!=0 && (i+k)>=Math.min(n-1,j))
                {
                    if(arr[j]>0)
                    {
                        j++;
                        continue go;
                    }
                    int x = Math.min(arr[i],Math.abs(arr[j]));
                    arr[i]-=x;
                    arr[j]+=x;
                    if(arr[j]>=0)
                    {
                        j++;
                    }
                }
            }
        }
        long ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=Math.abs(arr[i]);
        }
        return ans;
    }
}