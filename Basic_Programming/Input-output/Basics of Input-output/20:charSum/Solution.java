import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum = 0;
        for(int i = 0;i < str.length();i++)
        {
            sum = sum + str.charAt(i) - 96;
        }
        System.out.println(sum);

    }
}
