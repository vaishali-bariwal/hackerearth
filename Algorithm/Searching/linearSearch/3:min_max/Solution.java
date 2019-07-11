
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arrA = br.readLine().split(" ");
        long a[] = new long[n];
        long sum = 0;
        for(int i = 0;i < n;i++)
        {
            a[i] = Long.parseLong(arrA[i]);
            sum += a[i];
        }
        long min = sum;
        long max = 0,t;
        for(int i = 0;i < n;i++)
        {
            t = sum - a[i];
            if(min > t ) min = t;
            if(max < t) max = t;
        }
        System.out.println(min+" "+max);
    }
}
