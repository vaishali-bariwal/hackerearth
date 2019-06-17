

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name = br.readLine(); 
        int hc=0,ac=0,cc=0,kc=0,ec=0,rc=0,tc=0,i=0;
        if(n < 11)
        {
            System.out.println(0);
        }
        else{
            while(i < n)
            {
                char ch = name.charAt(i);
                switch(ch)
                {
                    case 'a': ac++;break; // a count
                    case 'h': hc++;break;
                    case 'c': cc++;break;
                    case 'k': kc++;break;
                    case 'e': ec++;break;
                    case 'r': rc++;break;
                    case 't': tc++;break;
                    default: break;
                }
                i++;
            }
            int min12 = hc < ac ? hc : ac;
            int min22 = ec < rc ? ec : rc;
            min22 = min22 < min12 ? min22 : min12;
            min22 = min22 / 2;
            int min11 = cc < kc ? cc < tc ? cc : tc :kc < tc ? kc : tc;
            System.out.println(min11 < min22 ? min11 : min22);
        }
    }
}
