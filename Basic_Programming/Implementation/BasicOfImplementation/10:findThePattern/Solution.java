
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String arr[] = br.readLine().split(" ");
        long min = Long.parseLong(arr[0]) , max = Long.parseLong(arr[0]);
        for(int i = 1;i < n;i++)
        {
            if(Long.parseLong(arr[i]) > max)
            {
                max = Long.parseLong(arr[i]);
            }
            if(Long.parseLong(arr[i]) < min)
            {
               min = Long.parseLong(arr[i]) ;
            }
        }
        System.out.println(min+max);
    }
}
