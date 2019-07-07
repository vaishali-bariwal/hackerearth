
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            int sum = 0;
            String str[] = br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(str[i]);
                sum = sum + bitcheck(a[i]);
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
    public static int bitcheck(int n)
    {
        for(int i=0;i<32;i++)
        {
            if((n & (1 << i))!=0)
            {
                return (int)Math.pow(2,i);
            }
        }
        return 0;
    }
}
