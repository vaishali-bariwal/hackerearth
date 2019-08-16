import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        long arr[][] = new long[1000][1000];
        for(int i=0; i<n; i++) {
            int x1 = f.nextInt();
            int y1 = f.nextInt();
            int x2 = f.nextInt();
            int y2 = f.nextInt();
            long c = f.nextLong();
            for(int x=x1-1; x<x2; x++) {
                for(int y=y1-1; y<y2; y++) {
                    if(arr[x][y] == 0) {
                        arr[x][y] = c;
                    } else if(arr[x][y] > 0) {
                        arr[x][y] = -1 * (arr[x][y]+c);
                    } else {
                        arr[x][y] = arr[x][y] - c;
                    }
                }
            }
        }
        long result = 0;
        for(int i=0; i<1000; i++) {
            for(int j=0; j<1000; j++) {
                if(arr[i][j] < 0) {
                    result += arr[i][j];
                }
            }
        }
        
        System.out.println(-1 * result);
    }
}
