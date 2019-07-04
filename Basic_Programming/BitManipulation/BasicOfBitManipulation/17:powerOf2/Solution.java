
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int count = 0;
        long a[] =new long[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Long.parseLong(br.readLine());
            if( a[i] == 1 || ((a[i] -1)&a[i]) == 0)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
