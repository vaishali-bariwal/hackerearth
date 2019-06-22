import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();              
        int t = Integer.parseInt(name);
        while(t > 0)
        {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            int n = str.length(), j = n-1;
            for(int i = 0;i < n;i++)
            {
                int c = str.charAt(i) + (str.charAt(j) - 96);
                if(c > 122)
                {
                    c = c - 122;
                    c = 96 + c;
                }
                sb.append((char)c);
                j--;
            }
            System.out.println(sb);
            t--;
        }
    }
}