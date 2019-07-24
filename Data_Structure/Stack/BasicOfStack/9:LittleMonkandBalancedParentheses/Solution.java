
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDI
        int n = Integer.parseInt(name);
        String arr[] = br.readLine().split(" ");
        int a[] = new int[n];
        int st[] = new int[n];
        int top = -1;
        int count = 0,max = 0;//1 -1 2 3 -3 ==2\4 // 1 -1 2 -2 3 -3 4 3 -3 2 ==6\8
        int p = 0;boolean f = false;//1 -1 2 -2 3 -3 4 3 -3 2 -2 1 -1 ==6\8
        for(int i = 0;i < n;i++)//1 -1 2 -2 3 -3 4 3 -3 2 -2 ==6\10
        {
            a[i] = Integer.parseInt(arr[i]);
            if(a[i] > 0)
            {
                if(f)count=0;
                top = push(st,top,a[i]);
                f =true;
            }
            else
            {
                if(!isEmpty(top))
                {
                    if((-1*a[i]) == st[top])
                    {
                        f = false;
                        top = pop(st,top);
                        count++;
                        max = Math.max(count,max);
                        
                    }
                    else
                    {
                       
                        count = 0;
                        break;
                    }
                }
                else
                {
                     max = Math.max(count,max);
                        count = 0;
                }
            }
        }
      
        System.out.println(2*max);
    }
    public static int push(int [] a,int top ,int n)
    {
        if(top == a.length -1)
        {
            return 0;
        }
        else
        {
            top++;
            a[top] = n;
            return top;
        }
    }
    public static int pop(int [] a,int top )
    {
        int t = a[top];
        top--;
        return top; 
    }
    public static boolean isEmpty(int top)
    {
        if(top == -1)
        return true;
        else
        return false;
    }
}
