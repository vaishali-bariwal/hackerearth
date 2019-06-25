
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t  = Integer.parseInt(br.readLine());
        boolean[] vow = new boolean[26];
        vow['a'-'a']=true; vow['i'-'a']=true;vow['e'-'a']=true;vow['o'-'a']=true;vow['u'-'a']=true;
        while(t-- > 0)
        {
            int n  = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            int j = 0,count=0;
            boolean cons = false;
            char prev = 'p';
            sb.append(Character.toUpperCase(str.charAt(j)));
            j++;
            while(j < n)
            {
                if(vow[str.charAt(j)-'a'] && (str.charAt(j)!=prev))
                {
                    if(cons)sb.append(count);
                    count = 0;
                    sb.append(str.charAt(j));
                    prev = str.charAt(j);
                    cons = false;
                }
                else if(!vow[str.charAt(j)-'a'])
                {
                    cons = true;
                    count++;
                    prev = str.charAt(j);
                }
                j++;
            }
            if(cons)sb.append(count);
            System.out.println(sb);
        }
        
    }
}
