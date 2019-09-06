
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        long a[] = new long[n];
        String[] arr = br.readLine().split(" ");
        for(int i = 0;i < n;i++)
        {
            a[i] = Long.parseLong(arr[i]);
        }
        for(int i = 0;i < n;i++)
        {
            int[] s1 = new int[n];
            int[] s2 = new int[n];
            int top1 = -1,top2 = -1;
            long x = -1 ,y =-1;
            s2[0] = -1;
            for(int j = 0;j < n;j++)
            {
                if(a[j] > a[i])
                {
                    if(j < i)
                    {
                        top1 = push(s1,top1,j+1);
                    }
                    else
                    {
                        top2 = push(s2 ,top2,j+1);
                    }
                }
            }
            x = pop(s1, top1);
            y = s2[0];
            sb.append((x+y)+" ");
        }
        System.out.println(sb);    // Writing output to STDOUT -2 0 6 1 3 
    }
    public static int push(int[] s ,int top,int n) 
    {
        if(top == s.length -1)
        {
            return top;
        }
        else{
            top++;
            s[top] = n;
            return top;
        }  
    }
    public static int pop(int[] s ,int top)
    {
        if(top == -1)
        {
            return -1;
        }
        else
        {
            int t = s[top];
            top--;
            return t;
        }  
    }
}
