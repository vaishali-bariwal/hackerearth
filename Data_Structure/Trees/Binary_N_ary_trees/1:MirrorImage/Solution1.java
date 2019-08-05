import java.util.*;
import java.io.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int q = Integer.parseInt(strs[1]);
        HashMap<Integer,String> m1 = new HashMap<Integer,String>();
        HashMap<String,Integer> m2 = new HashMap<String,Integer>();
        m1.put(1,"");
        m2.put("",1);
        for(int i=0;i<n-1;i++){
            strs = br.readLine().split(" ");
            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);
            char c = strs[2].charAt(0);
            if(m1.containsKey(x)){
                String temp = m1.get(x);
                temp += c;
                m1.put(y,temp);
                m2.put(temp,y);
            }
        }
        for(int i=0;i<q;i++){
            int k = Integer.parseInt(br.readLine());
            String data = m1.get(k);
            String newData = "";
            for(int j=0;j<data.length();j++){
                if(data.charAt(j) == 'L'){
                    newData += "R";
                }
                else{
                    newData += "L";
                }
            }
            int ans = -1;
            if(m2.containsKey(newData)){
                ans = m2.get(newData);
            }
            System.out.println(ans);
        }
        
 
    }
}