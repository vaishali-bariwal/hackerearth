
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String nab[] = br.readLine().split(" ");
            long n = Long.parseLong(nab[0]);
            long a = Long.parseLong(nab[1]);
            long b = Long.parseLong(nab[2]);
            long i = (b*n)/(a+b);
            long  min = (a * i * i)+(b * (n-i)*(n-i));
            i++;
            long cost = (a * i * i)+(b * (n-i)*(n-i));
            bw.write(Math.min(min,cost)+"\n");
        }
        bw.flush();
    }
}
