
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nq[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String arr[] = br.readLine().split(" ");
        int a[] = new int[n];
        boolean cons_bit[] = new boolean[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            cons_bit[i] = bitcheck(a[i]);
        }
        for(int i = 0;i < q;i++)
        {
            int count = 0;
            String[] lr = br.readLine().split(" ");
            int l = Integer.parseInt(lr[0])-1;
            int r = Integer.parseInt(lr[1])-1;
            for(int j = l;j <= r;j++)
            {
                if(cons_bit[j]) count++;
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
    public static boolean bitcheck(int n)
    {
        int count = 0;
        for(int i = 1;i < 32;i++)
        {
            if( (n & (1<<(i-1))) != 0 && (n & (1<<i)) != 0 )
            return true;
        }
        return false;
    }
}
