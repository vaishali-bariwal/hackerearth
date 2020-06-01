import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        for(int i = 0;i < n;i++)
        {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int cd1 = b-a;
            int cd2 = c-b;
            double t = Double.valueOf(Math.abs(cd1-cd2));
            sb.append(Math.round(t/2)+"\n");
                
        }System.out.println(sb);

    }
}
