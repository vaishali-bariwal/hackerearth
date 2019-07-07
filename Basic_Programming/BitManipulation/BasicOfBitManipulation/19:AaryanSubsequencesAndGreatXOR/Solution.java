
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int a[] = new int[n], or = 0;
        String arr[] = br.readLine().split(" ");
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            or = or | a[i];
        }
        System.out.println(or);
    }
}
