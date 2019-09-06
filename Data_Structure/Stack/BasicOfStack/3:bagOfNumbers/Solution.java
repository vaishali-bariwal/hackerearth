
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        StringBuilder sb=new StringBuilder();
        int n=s.length;
        Stack<Long> s = new Stack<>();
        Stack<String> st=new Stack<String>();
        for(int i=n-1;i>0;i--)
        {
            st.push(s[i]);
        }
        if(s.length<=3)
        sb.append("output ");
        else
        sb.append("output: ");
        while(!st.isEmpty())
        {
            sb.append(st.pop()+" ");
        }
         
        System.out.print(sb);
    }
}
