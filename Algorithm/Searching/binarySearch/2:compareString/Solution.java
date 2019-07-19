import java.util.*;
import java.io.*;
class CompareString{
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = scan.nextInt();
        int q = scan.nextInt();
        char ar1[] = scan.next().toCharArray();
        char ar2[] = scan.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        HashSet<Integer>  hs = new HashSet<>();
        for(int i=0;i<n;i++){
            if(ar1[i]!=ar2[i])
                hs.add(i);
        
        }
        while(q--!=0){
            int a = scan.nextInt();
            a--;
            if(!hs.contains(a)){
                if(ar1[a]!=1)
                sb.append("NO\n");
                else
                sb.append("YES\n");
                continue;
            }else{
                hs.remove(a);
                if(hs.size()==0) sb.append("YES\n");
                else sb.append("NO\n");
            }
        }
        out.print(sb.toString().trim());
        out.flush();
        out.close();
        scan.close();
    }
}
Language: Java 8