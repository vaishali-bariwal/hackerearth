
    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    import java.util.*;

    class TestClass {
        public static void main(String args[] ) throws Exception {
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            String name = br.readLine();                // Reading input from STDIN
            int n = Integer.parseInt(name);
            int a[] = new int[n];
            int count = 1;
            String[] arr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            int max = a[0];
            for (int i = 1; i < n; i++) 
            {
                if(max > a[i])
                count++;
                max = a[i];
            }
            System.out.println(count);
        }
    }
