    
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;
    
    class TestClass {
        public static void main(String args[] ) throws Exception {
           
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();                // Reading input from STDIN
            int n = Integer.parseInt(name);
            String[] arr = br.readLine().split(" ");
            int a[] = new int[n];
            int in[] = new int[n];
            for(int i = 0;i < n;i++)
            {
                a[i] = Integer.parseInt(arr[i]);
                in[i] = a[i];
            }
            for(int i = 0;i < n;i++)
            {
                int temp = a[i];
                int j = i;
                while(j > 0 && temp < a[j-1])
                {
                    a[j] = a[j-1];
                    j = j-1;
                }
                a[j] = temp;
            }
            for(int i = 0;i < n;i++)
            {
                for(int j = 0;j < n;j++)
                {
                    if(a[j] ==in[i])System.out.print(j+1+" ");
                }
            }
        }
    }
