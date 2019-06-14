import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;
    class Solution {
       
        public static void main(String args[] ) throws Exception {
           
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();                // Reading input from STDIN
            int t = Integer.parseInt(name);
            for(int  j = 0;j < t;j++)
            {
                int k = 0;
                int a[] = {6,2,5,5,4,5,6,3,7,6};
                String n = br.readLine();
                for(int i = 0 ;i < n.length(); i++)
                {
                    char c = n.charAt(i);
                    int d = c - '0';
                    k = k + a[d];
                }
 
            
                if (k % 2 == 0 )
                {
                    for (int i = 0 ; i < (k/2); i++)
                    {
                        System.out.print("1");
                    }
                }
                else
                {
                    System.out.print("7");
                    for (int i = 0; i < (k/2)-1; i++)
                    {
                        System.out.print("1");
                    }
                }
                 System.out.println();
            }
        }
    }
