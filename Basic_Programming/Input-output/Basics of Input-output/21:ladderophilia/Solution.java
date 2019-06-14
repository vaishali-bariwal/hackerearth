
import java.util.*;

class Soultion {
    public static void main(String args[] ) throws Exception {
    
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i< 5;i++){
            for(int j = 0;j < 5;j++){
                if((j==0 || j==4) && i%2 != 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int k = 0;k< n;k++){
            System.out.println("*****");
            for(int i = 0;i< 5;i++){
              for(int j = 0;j < 5;j++){
                if((j==0 || j==4) && i%2 != 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
             }
             System.out.println("");
            }
        }
         
    }
}
