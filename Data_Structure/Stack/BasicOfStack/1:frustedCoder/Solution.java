
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
		for(int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(a);
        for(int i = 1;i < n;i++)
        {
            if(a[i]-a[i-1] > 0)
            {
                a[i-1] = 0;
            }
            else
            {
                int j=i-1;
                while(j>=0)
                {
                    if(a[j]!=0&&a[i]-a[j]>0)
                    {
                        a[j]=0;break;
                        
                    }
                    else
                        { j--;}
                }
            }
        }
        int sum=0; 
        for(int i=0; i<n; i++)
        {
            if(a[i]!=0)
                sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
