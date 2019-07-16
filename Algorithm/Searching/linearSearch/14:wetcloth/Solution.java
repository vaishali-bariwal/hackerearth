import java.io.*;
import java.util.*;
class WetClothes{
	public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = in.readLine().split(" ");
        String[] line2 = in.readLine().split(" ");
        String[] line3 = in.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        int g = Integer.parseInt(line1[2]);
        int t[] = new int[n];
        int arr[] = new int[m];
        for(int i=0;i<n;i++){
        	t[i] = Integer.parseInt(line2[i]);
        }
        for(int i=0;i<m;i++){
        	arr[i] = Integer.parseInt(line3[i]);
        }
        Arrays.sort(arr);
        int temp = 0;
        for(int i=1;i<n;i++){
        	int diff = t[i]-t[i-1];
        	if(temp<diff){
        		temp = diff;
        	}
        }
        int counter = 0;
        for(int i=0;i<m;i++){
        	if(arr[i]<=temp)counter++;
        }
        System.out.println(counter);
    }
}
