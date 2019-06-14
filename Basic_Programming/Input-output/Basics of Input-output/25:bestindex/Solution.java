

     
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer; 
class TestClass {
    public static void main(String args[] ) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    int size=Integer.parseInt(st.nextToken()); 
    long arr[]=new long[(int)size];
    long count=2,temp;
    int i,p;
    long mx = Long.MIN_VALUE;
    StringTokenizer st2 = new StringTokenizer(br.readLine()); 
    for(i=0;i<size;i++)
    {
    arr[i]=Long.parseLong(st2.nextToken());
    }
    for(i=size-2;i>=0;i--)
    {
    arr[i]+=arr[i+1];
    }
    for(i=1,p=1;i<=size;i++)
    {
        if (i==p+count)
        {
            p+=count;
            count++;
        }
        if(p!=i)
            temp=arr[size-i]-arr[size-i+p];
        else
            temp=arr[size-i];
        if(temp>mx)
            mx=temp;
    }
    System.out.println(mx);
    }
}

