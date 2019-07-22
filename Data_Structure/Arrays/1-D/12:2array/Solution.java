
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();             // Reading input from STDIN
        int n = Integer.parseInt(name);
        String arr[] = br.readLine().split(" ");
		String brr[] = br.readLine().split(" ");
		int sum1 = 0,sum2 = 0 ,count1 = 0,count2 = 0, ans = 0;
		int a[] = new int[n] , b[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(arr[i]);
			b[i] = Integer.parseInt(brr[i]);
			if(a[i] < 0)
				count1++;
			else
			    sum1 += a[i];
			if(b[i] < 0)
				count2++;
			else
			    sum2 += b[i];
		}
		int	diff=sum1-sum2;
		if(diff<0)
		{
			diff=-diff;
		}
		if(count1==count2)
		{
			System.out.println("Infinite");
		}
		else if(sum1>sum2 && count2==0)
		{
			System.out.println("0");
		}
		else if(sum1<sum2 && count1==0)
		{
			System.out.println("0");
		}
		else
		{
			if(count1==1 || count1==0)
			{
				ans=ans+count1;
			}
			else
			{
				ans=ans+(diff)+1;
			}
			if(count2==1 || count2==0)
			{
				ans=ans+count2;
			}
			else
			{
				ans = ans + (diff)+1;
			}
			System.out.println(ans);
		}
    }
    
}


