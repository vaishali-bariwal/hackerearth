import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t1 = Long.parseLong(br.readLine());
        String n1[] = br.readLine().split(" ");
        long result = 0;
        if (t1 == 1) {
            System.out.println(n1[0]);
        } else {
            long k = otherGCD(Integer.parseInt(n1[0]), Integer.parseInt(n1[1]));
            if (k == 0)
                result = 0;
            else
                result = (Integer.parseInt(n1[0]) * Integer.parseInt(n1[1])) / k;
            for (int i = 2; i < n1.length; i++) {
                k = otherGCD(result, Integer.parseInt(n1[i]));
                if (k == 0)
                    result = 0;
                else
                    result = (result * Integer.parseInt(n1[i])) / k;
            }
            System.out.println(result);
        }
    }
 
    public static long otherGCD(long a, long b) {
        if (a == 0)
            return b;
        else if (a > b)
            return otherGCD(a % b, b);
        else
            return otherGCD(b % a, a);
    }
 
}