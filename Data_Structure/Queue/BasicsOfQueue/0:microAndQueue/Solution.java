
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        int q[] = new int[n];
        int rear = 0,front = 0;
        StringBuilder sb = new StringBuilder();
        while(n-- > 0)
        {
            String s[] = br.readLine().split(" ");
            if(s.length > 1)
            {
                rear = enqueue(q,rear,Integer.parseInt(s[1]));
                sb.append(rear-front+"\n");
            }
            else
            {
                int t = -1;
                if(front == rear)
                {
                    t=-1;
                }
                else
                {
                    t = q[front];
                    front = dequeue(q,front);
                }
                sb.append(t+" "+(rear-front)+"\n");
            }
        }
        System.out.println(sb);
    }
    public static int enqueue(int a[],int rear,int n)
    {
        if(rear == a.length)
        {
            System.out.println("queue is full");
            return rear;
        }
        a[rear] = n;
        rear++;
        return rear;
        
    }
    public static int dequeue(int a[],int front)
    {
        int t = a[front];
        front++;
        return front;
        
    }
}
