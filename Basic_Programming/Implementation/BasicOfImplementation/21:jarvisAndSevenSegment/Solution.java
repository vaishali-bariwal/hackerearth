
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tstr = br.readLine();
        int t = Integer.parseInt(tstr);
        while(t > 0)
        {
            String nstr = br.readLine();
            int n = Integer.parseInt(nstr),min  = 1000001   ,tem = 0,l = 0;
            String[] a = br.readLine().split(" ");
            for(int i = 0;i < n;i++)
            {
                int j = 0;
                tem = 0;
                while(j < a[i].length())
                {
                    char c = a[i].charAt(j);
                    if(c == '2' || c=='5'|| c=='3')
                    {
                        tem = tem + 5;
                    }
                    if(c == '6'|| c== '9'||c=='0')
                    {
                        tem += 6;
                    }
                    if(c == '1')
                    {
                        tem += 2;
                    }
                    if(c=='8')
                    {
                        tem += 7;
                    }
                    if(c == '4')
                    {
                        tem += 4;
                    }
                    if(c == '7')
                    {
                        tem += 3;
                    }
                    j++;
                }
                if(min > tem)
                {
                    min = tem;
                    l = i;
                }
            }
            System.out.println(a[l]);
            t--;
        }
        
    }
}
