import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        while(t-- >0)
        {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            int alpha[] = new int[26];
            boolean flag = false;
            char[][] a = new char[n][m];
            for(int i = 0;i < n;i++)
            {
                String arr = br.readLine();
                for(int j = 0;j < m;j++)
                {
                    a[i][j] = arr.charAt(j);
                }
            }
            String s = br.readLine();
            char ch = ' ';
            int k = 0;
            boolean flag2 = false;
            StringBuilder str = new StringBuilder();
            int i = 0;
            while(i < n && k < s.length())
            {
                ch = s.charAt(k);//System.out.println(ch +" "+i);
                flag2 = false;
                for(int j = 0;j < m;j++)
                {
                    if(ch == a[i][j])
                    {
                        //System.out.println("hii");
                        str.append(a[i][j]);
                        a[i][j] = ' ';
                        flag2 = true;
                        k++;
                        break;
                    }
                }
                i = i+1;
                if(!flag2){ break;}
                if(i == n && k < s.length()) {i = 0;}
            }
            sb.append(flag2 ? "Yes"+"\n" : "No"+"\n");
        
        }
        System.out.println(sb);
    }
}
