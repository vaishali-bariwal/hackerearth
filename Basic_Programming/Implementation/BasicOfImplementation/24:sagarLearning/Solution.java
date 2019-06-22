import java.util.Scanner;
     
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            long n = sc.nextLong() / 3;
            if( n == 0){
                sb.append("-1\n");
            }
            else{
                sb.append(n+" "+(n*2)+" "+(n*3)+"\n");
            }
        }
        System.out.print(sb);
        sc.close();
    }
}