
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(T);
        StringBuilder sb = new StringBuilder();
        boolean vowel[] = new boolean[26];
        vowel['a'-'a'] = true;vowel['e'-'a'] = true;vowel['i'-'a'] = true;
        vowel['o'-'a'] = true;vowel['u'-'a'] = true;
        while(t-- > 0)
        {
            String s = br.readLine();  
            String sl = s.toLowerCase();
            int count = 0;
            for(int i = 0;i < sl.length();i++)
            {
                if(vowel[sl.charAt(i) - 'a'])
                    count++;
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
