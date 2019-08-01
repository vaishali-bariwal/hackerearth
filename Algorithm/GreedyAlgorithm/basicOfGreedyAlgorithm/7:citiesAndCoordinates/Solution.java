import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int T = Integer.parseInt(name);
        while(T-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
           int minX = Integer.MAX_VALUE,minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE ,maxY = Integer.MIN_VALUE;
            while(n-- > 0)
            {
                String xy[] = br.readLine().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                minX = Math.min(minX,x);
                minY = Math.min(minY,y);
                maxX = Math.max(maxX,x);
                maxY = Math.max(maxY,Y);
            }
            long l1 = maxX-minX;
            long l2 = 
            if(()>(maxY-minY))
            System.out.println((maxX-minX)*(maxX-minX));
            else
            System.out.println((maxY-minY)*(maxY-minY));
        }

    }
}
