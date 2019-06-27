import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.*;
class TestClass {
    static final int INT_BITS = 32;
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int count = 0,a,b;
            String binary = br.readLine();
            char[] arr = binary.toCharArray();
            for (char c : arr){
                if(c=='0'){
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}
