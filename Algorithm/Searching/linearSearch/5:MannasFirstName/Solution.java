import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n-- > 0)
        {
            String str = br.readLine();
            int  l = str.length(), i = 0, count1 = 0,count2 = 0;
            while(i < l)
            {
                if(i+6 < l)
                {
                    if(str.substring(i, i + 7).equalsIgnoreCase("SUVOJIT"))
                    {
                        //System.out.println("kkk");
                        count1++;
                        i = i+7;
                    }
                    else if(str.substring(i, i + 4).equalsIgnoreCase("SUVO"))
                    {
                        count2++;
                        i = i+4;
                    }
                    else
                    {
                        i++;
                    }
                }
                else if(i+3 < l)
                {
                    if(str.substring(i, i + 4).equalsIgnoreCase("SUVO"))
                    {
                        count2++;
                        i = i + 4;
                    }
                    else
                    {
                        i++;
                    }
                }
                else
                {  
                    break;
                }

            }
            sb.append("SUVO = "+count2+", SUVOJIT = "+count1+"\n");
        }
        System.out.println(sb);
    }
}