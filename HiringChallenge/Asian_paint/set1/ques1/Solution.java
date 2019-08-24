import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 4;
        String[] arr = br.readLine().split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        int min = a[0];
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += a[i];
        }
        sum += (n-2)*min;
        System.out.println(sum);
    }
}