
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static int c1,c2,c3,c4;
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int t = Integer.parseInt(name);
        while(t>0)
        {
            String str[] =  br.readLine().split(" ");
            c1 = Integer.parseInt(str[0]);c2 = Integer.parseInt(str[1]);
            c3 = Integer.parseInt(str[2]);c4 = Integer.parseInt(str[3]);
            int s = 0 ,p ,q,d;
            for(int a=0;a<2;a++)
            {
                for(int b=0;b<2;b++)
                {
                  for(int c=0;c<2;c++)
                  {
  	        	     d=check(a,b);
  	        	     p=check(d,c);
  	        	     d=check(b,c);
  	        	     q=check(a,d);
  	        	     if(p!=q)
  	        	     {
  	        	        s=1;
  	        	     }
  	               }
  	            }
         	}
  	        if(s==0)
  	        {
  	            System.out.println("Yes");
  	        }
            else
            {
                System.out.println("No");
            }
            t--;
        }
    }
    public static int check(int a,int b)
    {
        if(a==0 && b==0)
  	      return c1;
  	    if(a==0 && b==1)
  	      return c2;
        if(a==1 && b==0)
  	      return c3;
  	    else
  	      return c4;
    }
}
