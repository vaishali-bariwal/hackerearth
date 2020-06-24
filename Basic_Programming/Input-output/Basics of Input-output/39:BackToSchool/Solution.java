import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int[] a= new int[arr.length];
        int max = 0;
        for(int i = 0;i < arr.length;i++)
        {
             a[i] = Integer.parseInt(arr[i]);
             max = Math.max(a[i], max);

        }
        System.out.println(max);

    }
}
