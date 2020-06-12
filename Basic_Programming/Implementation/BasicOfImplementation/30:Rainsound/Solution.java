import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int T= Integer.parseInt(name);
        for(int i = 0;i < T;i++)
        {
            String[] arr = br.readLine().split(" ");
            double l = Double.parseDouble(arr[0]);
            double r = Double.parseDouble(arr[1]);
            double s = Double.parseDouble(arr[2]);
            if(s>r)
            {
                sb.append(-1+" "+-1);}//769086452 862586941 675674557  714442296 724665872 63423979
            else
            {
                int min = (int)Math.ceil(l/s);
                int max = (int)Math.floor(r/s);
                //System.out.println(r/s);
                if(min>max) sb.append(-1+" "+-1);
                else sb.append(min+" "+max);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
