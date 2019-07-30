

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String ar[] = br.readLine().split(" ");
        int a[] = new int[n];
        for(int i =0;i < n;i++)
        {
            a[i] = Integer.parseInt(ar[i]);
        }
         ArrayList<Integer> l = new ArrayList<Integer>();
        int st[] = new int[n];
        int top = -1;
        for(int i =0;i < n;i++)
        {
            if((a[i]&1)==0)
            {
                top = push(st,top,a[i]);
              
            }
            else
            {
                while(!isempty(top))
                {
                    l.add(st[top]);
                    top = pop(top);
                }
                l.add(a[i]);
               
            }
        }
        while(!isempty(top))
        {
            l.add(st[top]);
            top = pop(top);
        }
        for(int i:l)
            System.out.print(i+" ");

    }

public static int pop(int top)
{
    top--;
    return top;
}
public static int push(int a[],int top,int n)
{
    if(top == a.length -1)
    {
        return 0;
    }
    top++;
    a[top] = n;
    return top;
}
public static boolean isempty(int top)
{
    if (top==-1)
    return true;
    else
    return false;
}
}
