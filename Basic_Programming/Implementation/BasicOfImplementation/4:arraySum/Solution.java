
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String arry[] = br.readLine().split(" ");
        long sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum = sum + Integer.parseInt(arry[i]);
        }
        System.out.println(sum);
    }
}
