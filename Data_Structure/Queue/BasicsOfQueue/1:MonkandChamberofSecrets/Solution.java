import java.io.*;
import java.util.*;
class userDefinedHeap
{
    int i;
    int value;
    userDefinedHeap(int i,int value)
    {
        this.i=i;
        this.value=value;
    }
}
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Queue<userDefinedHeap> q1 = new LinkedList<userDefinedHeap>();
        Queue<userDefinedHeap> q2 = new LinkedList<userDefinedHeap>();
        for(int i=0;i<n;i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            userDefinedHeap a = new userDefinedHeap(i+1,temp);
            q1.add(a);
        }
        for(int i=0;i<x;i++)
        {
            userDefinedHeap max = null;
            for(int j=0;j<x;j++)
            {
                if(q1.isEmpty())
                {
                    break;
                }
                userDefinedHeap temp = q1.remove();
                if(max==null||temp.value>max.value)
                {
                    max=temp;
                }
                q2.add(temp);
            }
            while(!q2.isEmpty())
            {
                userDefinedHeap temp = q2.remove();
                if(temp!=max)
                {
                   if(temp.value!=0)
                    {
                        temp.value--;
                    } 
                    q1.add(temp);
                }
            }
            System.out.print(max.i+" ");
        }
    }
}
