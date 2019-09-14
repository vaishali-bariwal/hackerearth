import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {   String[] arr_ =  br.readLine().split(" ");
            int Array[] = new int[2];
            for(int i=0;i<2;i++){
                  Array[i] = Integer.parseInt(arr_[i]);
            }
            int N = Array[0];
            int q = Array[1];
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
          
            String[] arr_query = br.readLine().split(" ");
            int[] query = new int[q];
            for(int i_query=0; i_query<arr_query.length; i_query++)
            {
            	query[i_query] = Integer.parseInt(arr_query[i_query]);
            }
            
            int[] out_ = final_arr(A, query, q, N);
            System.out.print(out_[0]);
            for(int i_out_=1; i_out_<out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static int[] final_arr(int[] a, int[] query, int q, int n){
        // Write your code here
        Arrays.sort(query);
        int temp = 0;
        for(int i = 0;i<q;i++)
        {
            if(temp < a[query[i]])
            {
                temp =  a[query[i]];
                for(int j = query[i] + 1;j < n;j++)
                {
                    if(a[j] < a[query[i]]) a[j] = 0;
                }
            }
        }
        return a;
    }
}