
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            String s = br.readLine().trim();
            int n = s.length();
            Stack<Character> st = new Stack<Character>();
            boolean flag = true;
            for(int i = 0;i < n;i++)
            {
                if(s.charAt(i) == '('||s.charAt(i) == '{' ||s.charAt(i) == '[')
                {
                    st.push(s.charAt(i));
                }
                else
                {
                    char ch = s.charAt(i);
                    if(ch == ')')
                    {
                        if(!st.isEmpty() && st.peek() == '(')st.pop();
                        else
                        {
                        flag = false;
                        break;
                        }
                    }
                    else if(ch == ']')
                    {
                        if(!st.isEmpty() && st.peek() == '[')st.pop();
                        else
                        {
                        flag = false;
                        break;
                        }
                    }
                    else if(ch == '}')
                    {
                        if(!st.isEmpty() && st.peek() == '{')st.pop();
                        else
                        {
                        flag = false;
                        break;
                        }
                    }
                    
                }
            }
            if(!st.isEmpty()) flag = false;
            sb.append(flag?"YES"+"\n" :"NO"+"\n");
        }
        System.out.println(sb);
    }
}
