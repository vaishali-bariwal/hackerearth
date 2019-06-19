
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine(); 
        int count = 0 ,i = 0,c;
        while(i < n)
        {
           if(Character.isDigit(str.charAt(i)))
           {
               count++;
               while(Character.isDigit(str.charAt(i)))
               {
                   i++;
                   if(i >= n)
                   {
                      break; 
                   }
               }
           }
           else
           {
               i++;
           }
        }
        System.out.println(count);
        t--;
        }
    }
}
