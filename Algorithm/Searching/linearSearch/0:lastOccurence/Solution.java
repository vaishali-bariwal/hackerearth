
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]),i;
        String arr[] = br.readLine().split(" ");
        for(i = n-1; i >= 0;i--)
        {
            if(Integer.parseInt(arr[i]) == m)
            {
                System.out.println(i+1);
                break;
            }
        }
        if(i < 0)
            System.out.println(-1);
    }
}
