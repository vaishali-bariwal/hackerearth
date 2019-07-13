import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int day[] = new int[31];
        while(n > 0)
        {
            String[] str = br.readLine().split(" ");
            int l = str.length;
            for(int i = 0;i < l;i++)
            {
                if(str[i].length() > 0)
                {
                    if(Character.isDigit(str[i].charAt(0)))
                    {
                        int num = Integer.parseInt(str[i]);
                        if(str[0].charAt(0) == 'G') day[num] += 2;
                        else day[num] += 1;
                    }
                }
            }
            n--;
        }
        int max = 0,k =0;
        for(int i = 0;i < 31;i++)
        {
            if(max < day[i])
            {
                max = day[i];
                k = i;
            }
        }   
        if(k == 19|| k == 20)
        System.out.println("Date");
        else 
        System.out.println("No Date");
    }
}