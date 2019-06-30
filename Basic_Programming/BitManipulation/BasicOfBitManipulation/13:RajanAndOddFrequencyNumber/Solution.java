import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        n = 2*n + 1;
        int a[] = new int[n];
        int xo = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            xo ^= a[i];
        }
        System.out.println(xo);
    }
}