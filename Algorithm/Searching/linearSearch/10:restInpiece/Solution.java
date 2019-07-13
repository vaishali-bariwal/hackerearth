import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String num = br.readLine();
            int i = num.indexOf("21");
            if(i >= 0)
            {
                sb.append("The streak is broken!"+"\n");
            }
            else if( Integer.parseInt(num)%21 == 0)
            {
                sb.append("The streak is broken!"+"\n");
            }
            else
            {
                sb.append("The streak lives still in our heart!"+"\n");
            }
        }
        System.out.println(sb);
    }
}
