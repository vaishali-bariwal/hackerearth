
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();                // Reading input from STDIN
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<Character>();
        for(int i = 0;i < n;i++)
        {
            if(!s.isEmpty())
            {
                if(str.charAt(i) == s.peek())
                {
                    int t = s.pop();
                }
                else
                {
                    s.push(str.charAt(i));
                }
            }
            else
            {
                s.push(str.charAt(i));
            }
        }
        int m = s.size();
        if(m == 0) System.out.println("Empty String");
        for (int i = 0; i < m; i++) {
            System.out.print(s.get(i));
        }

    }
}
