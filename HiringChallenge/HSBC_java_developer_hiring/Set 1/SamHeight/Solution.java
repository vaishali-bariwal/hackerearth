import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String ns[] = br.readLine().split(" ");
            int N = Integer.parseInt(ns[0]);
            int S = Integer.parseInt(ns[1]);
            String a[] = br.readLine().split(" ");
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] =  Integer.parseInt(a[i]);
            }
            int out = solve(arr, N , S);
            System.out.println(out);
        }
    }
    static int solve(int[] arr, int n,int s){
        int countL = 0,countR = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] < s)
            {
                countL++;
            }
            if(arr[i] > s)
            {
                countR++;
            }
        }
        if(countR==countL)return 0;
        else if(countR > countL) return countR-countL;
        else return countL - countR;
    }
}