import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            int n1 = s1.length() , n2 = s2.length();
            boolean yes = false;
            boolean a[] = new boolean[26];
            for(int i = 0;i < n1;i++)
            {
                a[s1.charAt(i) - 'a'] = true;
            }
            for(int i = 0;i < n2;i++)
            {
                if(a[s2.charAt(i) - 'a'])
                {
                    yes = true;
                }
            }
            sb.append(yes?"Yes"+"\n":"No"+"\n");
        }
        System.out.println(sb);
    }
}