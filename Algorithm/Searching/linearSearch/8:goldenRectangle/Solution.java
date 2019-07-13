import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        float a = (float)1.6 , b = (float)1.7;
        while(n-- > 0)
        {
            String wh[] = br.readLine().split(" ");
            double w = Double.parseDouble(wh[0]);
            double h = Double.parseDouble(wh[1]);
            if( 1.6<=w/h&& w/h<=1.7||1.6<=h/w&& h/w<=1.7)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
        