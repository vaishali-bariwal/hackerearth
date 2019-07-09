
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();                // Reading input from STDIN
        int n= Integer.parseInt(N);
        String arr[] = br.readLine().split(" "); 
        int[] a = new int[n];
        for(int i = 0;i < n;i++)
            a[i] = Integer.parseInt(arr[i]);
        for(int i = 0;i < n;i++)
        {
            boolean flag = true;
            for(int j = i;j < n;j++)
            {
                if(a[i] < a[j])
                {
                    flag = false;
                    break;
                }
            }
            if(flag) sb.append(a[i]+" ");
        }
        System.out.println(sb);
    }
}
