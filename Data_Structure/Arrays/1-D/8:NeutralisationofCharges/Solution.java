
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();                 // Reading input from STDIN
        int n = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<Character>();
        String s = br.readLine();
        for(int i = 0;i < n;i++)
        {
            if(st.empty()) 
            {
                st.push(s.charAt(i));
            }
            else
            {
                char c = st.pop();
                if( c == s.charAt(i))
                    continue;
                else 
                    st.push(c);
                    st.push(s.charAt(i));
            }
        }
        for(int i = 0; i < st.size();i++)
        {
            sb.append(st.elementAt(i));
        }
        System.out.println(sb.length());
        System.out.println(sb);
    }//aaacccbbcccd 
}
