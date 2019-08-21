import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int n =  Integer.parseInt(name);
        int a[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) 
        {
            a[i] = Integer.parseInt(br.readLine());
        }
        heapsort(a,n);
        for (int i = 0; i < n; i++) {
            if(i < 2)
            {
                sb.append(-1+"\n");
            }
            else
            {
                int j = i;
                sb.append(a[j]+" "+a[j-1]+" "+a[j-2]+"\n");
            }
        }
        System.out.println(sb);
    }
    public static void heapsort(int a[] , int n) {
        
        for(int i = n/2-1;i >=0;i--)
        {
            heapify(a,n,i);
        }
        for(int i = n-1;i >=0;i--)
        {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            heapify(a,i,0);
        }
    }
    public static void heapify(int a[] ,int n,int i) {

        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n&& a[largest]<a[l])
        largest = l;
        if(r<n && a[largest]<a[r])
        largest = r;
        if(largest != i)
        {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n, largest);
        }
    }
}