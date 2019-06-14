
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Solution{
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int k = 0;k < t ;k++)
        {
            String a = br.readLine();
            String b = br.readLine();
            int arr[] = new int[26]; 
            for (int i = 0; i < a.length(); i++) { 
            arr[a.charAt(i) - 'a']++; 
            } 
  
            for (int i = 0; i < b.length(); i++) { 
            arr[b.charAt(i) - 'a']--; 
            } 
  
            int ans = 0; 
            for (int i = 0; i < 26; i++) { 
            ans += Math.abs(arr[i]); 
            } 
            System.out.println(ans);
        }

    }
}
