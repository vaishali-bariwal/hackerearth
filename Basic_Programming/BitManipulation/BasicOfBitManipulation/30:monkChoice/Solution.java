import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i=0;i<T;i++){
            int N = s.nextInt();
            int K = s.nextInt();
            List<Integer> binList = new ArrayList();
            for(int j=0;j<N;j++){
                int num = s.nextInt();
                int temp=num;
                int bits=0;
                while(temp!=0){
                    temp=temp&(temp-1);
                    bits+=1;
                }
                binList.add(bits);
            }
            Collections.sort(binList);
            // System.out.println(binList);
            int candy=0;
            for(int j=1;j<=K;j++){
                candy+=binList.get(N-j);
            }
            System.out.println(candy);
        }
    }
}
Language: Java 8