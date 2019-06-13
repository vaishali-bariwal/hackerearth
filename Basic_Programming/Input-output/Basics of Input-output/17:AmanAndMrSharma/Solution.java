import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(),count = 0;
        for(int i = 0;i< d;i++)
        {
            int r = sc.nextInt();
            int x = sc.nextInt();
            int cur = 44 * r;         // 22/7 * 2 * r <= x * 100
            int total_m = x * 700;    // 22 * 2 * r <= x * 700
            if(cur <= total_m)
            {count++;}
        }
        System.out.println(count);
    }
}
/*If you use perimeter = 2(22/7)*radius <= horlics*100 formula then the resedual 
floating point will cause error and might cause some deviation in the number of toffee in
 final calculation in big input so instead use  perimeter = 44*radius <= horlics*700.*/