import java.util.*;
import java.lang.*;
import java.io.*;
class code
{
    public static long largest_power(long N)
    {
        N = N| (N>>1);
        N = N| (N>>2);
        N = N| (N>>4);
        N = N| (N>>8);
        N = N| (N>>16);
        
        return (N+1)>>1;
    }
    public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
        int N=Integer.parseInt(br.readLine());
        int Ans=(int)largest_power(N);
        int bits=(int)(Math.log(N)/Math.log(2))+1;
        for(int i=bits;i>0;i--)
            if(((((1<<i)&Ans)!=0?1:0)^(((1<<i-1)&N)!=0?1:0))==1)
                Ans=(1<<(i-1))|Ans;
        pw.println(Ans);
        pw.flush();
	}
}