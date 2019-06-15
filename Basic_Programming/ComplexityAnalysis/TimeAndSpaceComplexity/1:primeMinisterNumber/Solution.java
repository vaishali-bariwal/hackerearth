
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution{
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = br.readLine().split(" ");                // Reading input from STDIN
        int a = Integer.parseInt(name[0]);
        int b = Integer.parseInt(name[1]);
        for(int i = a;i <= b;i++)
        {
            if((i&1) == 1)
            {
                if(isPrime(i))
                {
                    int sum = 0 , n = i;
                    while(n>0)
                    {
                        sum = sum + (n%10);
                        n = n/10;
                    }
                    if(isPrime(sum))
                    {
                       System.out.print(i+" ");
                    }
                }
            }
        }
    }   
    static boolean isPrime(int n) 
    { 
        if (n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false; 
      
        return true; 
    }
    
}
