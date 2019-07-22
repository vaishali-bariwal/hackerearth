import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();             // Reading input from STDIN
        int n = Integer.parseInt(name);
        String arr[] = br.readLine().split(" ");
        int a[] = new int[n];
        int min = 100001,l = 0;
		for(int i = 0;i < n;i++)
		{
            a[i] = Integer.parseInt(arr[i]);
            if(min > a[i]) 
            {min = a[i];
             l = i;
            }
        }
        Stack<Integer> s = new Stack<Integer>();
        int temp = min;
        for (int i = 0; i < n; i++) {
            if(a[i]-temp == 1)
            {
                temp = a[i];
                while(!s.isEmpty())
                {
                    int p = s.pop();
                    if(p - temp == 1)
                    {
                        temp = p;
                    }
                    else
                    {
                        s.push(p);
                        break;
                    }
                }
            }
            else
            {
               if(i != l)
               {
                   s.push(a[i]);}
            }
        }
        if(s.isEmpty())
        {
            System.out.println("Happy");
        }
        else{
            System.out.println("Sad");
        }
    }
}// 5 4 3 2 1 6 7 8 9
//6 1 5 2 4 3 7 10 8 9