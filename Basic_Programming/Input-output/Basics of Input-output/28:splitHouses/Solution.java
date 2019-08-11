/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int length = Integer.parseInt(st.nextToken());
       st = new StringTokenizer(br.readLine());
       String[] arr = st.nextToken().split("");
       boolean ans = true;
       for(int i=0;i<length-1;i++){
           if(arr[i].equals("H")&&arr[i].equals(arr[i+1])){
               ans = false;
               System.out.println("NO");
               break;
           }
       }if(ans){
               System.out.println("YES");
               for(int i=0;i<length;i++){
                   if(arr[i].equals(".")){
                       arr[i] = "B";
                   }
                   System.out.print(arr[i]);
               }
               
           }
    }
}