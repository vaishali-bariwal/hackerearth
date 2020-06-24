import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int n = Integer.parseInt(name);
        String[] arr = br.readLine().split(" ");
        int d = Integer.parseInt(arr[n-1])%10;
        System.out.println(d==0?"Yes":"No");

    }
}
