import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();     
        int count0 = 0,count1 = 0 ;
        int n = str.length();
        if(str.charAt(0)=='0') count0++;
        else count1++;
        for(int i = 1;i < n;i++)
        {
            if(count0 == 6 || count1 ==6)
            {
              break;   
            }
            else if(str.charAt(i) == '0' && str.charAt(i-1) == '0')
            {
                count0++;
            }
            else if (str.charAt(i) == '0' && str.charAt(i-1) == '1')
            {
                count1 = 0;
                count0 = 1;
            }
            else if(str.charAt(i) == '1' && str.charAt(i-1) == '1')
            {
                count1++;
            }
            else if(str.charAt(i) == '1' && str.charAt(i-1) == '0')
            {
                count0 = 0;
                count1 = 1;
            }
           
        }
        System.out.println(count0 == 6||count1 == 6 ? "Sorry, sorry!" :"Good luck!");
    }
}
