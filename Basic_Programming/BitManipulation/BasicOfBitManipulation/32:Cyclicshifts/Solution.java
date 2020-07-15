import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int T = Integer.parseInt(name);
        int n ,m ;
        String c;
        for(int i = 0;i < T;i++)
        {
             String[] arr = br.readLine().split(" ");
             n = Integer.parseInt(arr[0]);
             m = Integer.parseInt(arr[1]);
             c = arr[2];
             String str = Integer.toBinaryString(n);
             
             if(str.length() < 16)
             {
                 int ad = 16 - str.length();
                 for (int j = 0; j < ad; j++) {
                    str = "0"+str;
                 }
             }
             if(c.equalsIgnoreCase("L"))
             {
                for (int j = 0; j < m; j++) {
                    str = str.substring(1,16)+ str.charAt(0);
                }
                sb.append(Integer.parseInt(str,2) +"\n");
             }
             else
             {
                for (int j = 0; j < m; j++) {
                    str = str.charAt(15) + str.substring(0,15);
                }
                sb.append(Integer.parseInt(str,2) +"\n");
             }     
        }
        System.out.println(sb);

    }
}
