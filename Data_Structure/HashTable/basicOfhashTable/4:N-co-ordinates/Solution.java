
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.parseInt(name);
        TreeMap<points,Integer> hm = new TreeMap<>();
        while(n-- > 0)
        {
            String xy[] = br.readLine().split(" ");
            points p = new points(Long.parseLong(xy[0]), Long.parseLong(xy[1]));
            if(hm.containsKey(p))
            {
                hm.put(p,hm.get(p)+1);
            }
            else
            {
                hm.put(p, 1);
            }
        }
        for (Map.Entry var  : hm.entrySet()) {
            System.out.println(var.getKey()+" "+ var.getValue());
        }

    }
}
class points implements Comparable<points>
{
    public long x;
    public long y;
    public points(long x, long y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int compareTo (points p)
    {
        return((this.x - p.x) != 0)?(int)(this.x - p.x) : (int)(this.y - p.y);
    }
    public String toString()
    {
        return new String(this.x + " "+ this.y);
    }
    
}