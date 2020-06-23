import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int T = Integer.parseInt(name);
        Set<Character> v = new HashSet<Character>(); 
        v.add('a');v.add('i');v.add('o');v.add('u');v.add('e');
        for(int t = 0;t < T;t++)
        {
            int l = Integer.parseInt(br.readLine());
            String str = br.readLine(); 
            int count=0;
            for(int i = 1 ;i < l;i++)
            {
                if(v.contains(str.charAt(i))&&!v.contains(str.charAt(i-1)))
                {
                    //System.out.println(str.charAt(i));
                   count++;
                }
            }
            sb.append(count+"\n");
        }
        System.out.print(sb);

    }
}
