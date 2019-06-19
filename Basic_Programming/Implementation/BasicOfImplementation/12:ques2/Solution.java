
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name[] = br.readLine().split(" ");                // Reading input from STDIN
        int n = Integer.parseInt(name[0]);
        int x = Integer.parseInt(name[1]);
        int y = Integer.parseInt(name[2]);
        String str[] = br.readLine().split(" ");
        boolean flag = true;
        for(int i = 0;i < n;i++)
        {
            if(Integer.parseInt(str[i]) >= x && Integer.parseInt(str[i]) <= y)
            {
                flag = true;
            }
            else
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
