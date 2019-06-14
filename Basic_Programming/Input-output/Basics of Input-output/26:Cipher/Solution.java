

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String a="";
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90)
            {
                int tiy =n%26;
                int temp=(int)s.charAt(i)+tiy;
                if(temp>90)
                {
                    while(temp>=65&&temp<=90)
                    temp-=26;
                    a=a+(char)(temp-26);
                }
                else
                a=a+(char)temp;
            }
            else if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122)
            {
                int tiy=n%26;
                int temp=(int)s.charAt(i)+tiy;
                if(temp>122)
                {
                    while(temp>=90&&temp<=122)
                    temp-=26;
                    a=a+(char)(temp-26);
                }
                else
                a=a+(char)temp;
            }
            else if((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57)
            {
                int tiy=n%10;
                int temp=(int)s.charAt(i)+tiy;
                if(temp>57)
                {
                    while(temp>=48&&temp<=57)
                    temp-=10;
                    a=a+(char)(temp-10);
                }
                else
                a=a+(char)temp;
            }
            else
            a=a+s.charAt(i);
        }
        System.out.print(a);
    }
     
    
}
    