import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         long out_ = SimilarElementsPairs(A,N);
         System.out.println(out_);

         wr.close();
         br.close();
    }

    static long SimilarElementsPairs(int[] A,int N){
        Arrays.sort(A);
        long count=0,ans=0,same=0;
        for(int i=1;i<N;i++)
        {
            if(Math.abs(A[i]-A[i-1])==1)
                count++;
            else if(A[i]==A[i-1])
                same++;
            else
            {
                if(count!=0)
                {
                    count+=same;
                    ans+=(count*(count+1))/2;
                }
                count=0;
                same=0;
            }
        }
        if(count!=0)
        {
            count+=same;
            ans+=(count*(count+1))/2;
        }
        return ans;
 
    
    }
}