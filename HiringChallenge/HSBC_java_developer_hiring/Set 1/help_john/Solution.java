import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            String a[] = br.readLine().split(" ");
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] =  Integer.parseInt(a[i]);
            }
            solve(arr, N);
        }
    }
        static void solve(int[] arr,int n)
        {
            int minmax[] = new int[2];
            System.out.println("-1 -1");
            for(int i = 1;i < n;i++)
            {
                findMinMax(arr,i,minmax);
                System.out.println(minmax[0]+" "+minmax[1]);
            }
        }
        static void findMinMax(int arr[],int k ,int minmax[])
        {
            minmax[0] = -1;minmax[1] = -1;
            int max = Integer.MAX_VALUE , min = -1;
            for (int i = 0; i < k; i++) 
            {
                if (arr[i] > arr[k]) 
                {
                    if (arr[i] < max) 
                        max = arr[i]; 
                } 
                else
                {
                    if(arr[i] > min)
                        min = arr[i];
                }
            }
            minmax[1] = max == Integer.MAX_VALUE ? -1 :max;
            minmax[0] = min;
        }
}