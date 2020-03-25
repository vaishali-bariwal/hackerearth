import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  n = Integer.parseInt(br.readLine());   
        System.out.println(logic(n));  
    }
    public static int logic(int n) 
    {
        if(n==2) return 2;
        if((n&1)==0) return (1+logic(n/2));
        else return(1+logic(n-1));
        
    }
}