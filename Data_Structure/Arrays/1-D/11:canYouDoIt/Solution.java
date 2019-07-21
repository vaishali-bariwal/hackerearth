
    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    import java.util.*;

    class TestClass {
        public static void main(String args[] ) throws Exception {
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            String name = br.readLine();                // Reading input from STDIN
            int t = Integer.parseInt(name);
            while(t-- > 0)
            {
                int n = Integer.parseInt(br.readLine());
                String[] arr = br.readLine().split(" ");
                int a[] = new int[n];
                int max1 = 0 , max2 = 0 , min1 = 100001,min2 = 100001;
                for (int i = 0; i < n; i++) 
                {
                    a[i] = Integer.parseInt(arr[i]);
                    if(max1 < a[i] + i)
                        max1 = a[i] + i;
                    if(min1 > a[i] + i)
                        min1 = a[i] + i;
                    if(max2 < a[i] - i)
                        max2 = a[i] - i;
                    if(min2 > a[i] - i)
                        min2 = a[i] - i;
                }
                sb.append(Math.max(max1-min1, max2-min2)+"\n");
            }
            System.out.println(sb);
        }
    }
