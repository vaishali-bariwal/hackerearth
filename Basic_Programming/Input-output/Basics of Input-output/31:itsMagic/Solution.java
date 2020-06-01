import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        String[] arr = br.readLine().split(" ");
        int[] a= new int[n];
        long sum  = 0;
        for(int i = 0;i < n;i++)
        {
             a[i] = Integer.parseInt(arr[i]);
             sum +=  a[i];
        }
        int ind =-1;
        for(int i = 0;i < n;i++)
        {
            if((sum - a[i])%7==0)
            {
                if(ind == -1 || a[ind] > a[i]){
                        ind = i;
                    }

            }

        }
        System.out.println(ind);
        
    }
}
