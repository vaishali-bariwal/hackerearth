
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
        int count = 0, bitcount[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
            if(bitcheck(a[i]))
                bitcount[i] = ++count;
            else
                bitcount[i] = count;
        }
        while(q-- > 0)
        {
            String[] lr = br.readLine().split(" ");
            int l = Integer.parseInt(lr[0])-1;
            int r = Integer.parseInt(lr[1])-1;
            /*for(int j = l;j <= r;j++)
            {
                if(bitcheck(a[j])) count++;
            }*/
            if(l==0)
            {
                sb.append(bitcount[r]+"\n");
            }
            else
            {
               sb.append((bitcount[r] - bitcount[l-1])+"\n");
            }
        }
        System.out.println(sb);
    }
    public static boolean bitcheck(int n)
    {
        int count = 0;
        if( (n &(n >>> 1)) != 0 )
            return true;
        else
            return false;
    }
}
