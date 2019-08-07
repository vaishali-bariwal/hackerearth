
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ne[] = br.readLine().split(" ");                // Reading input from STDIN
		int n = Integer.parseInt(ne[0]);
		int K = Integer.parseInt(ne[1]);
		boolean[][] anc = new boolean[n][n];
		for (int i = 0; i < anc.length; i++) {
			Arrays.fill(anc[i], false);
		}
		String arr[] = br.readLine().split(" ");  
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(arr[i]);
		}
		String prr[] = br.readLine().split(" ");  
		int[] parent = new int[n];
		parent[0] = -1;
		for (int i = 1; i < n; i++) {
			parent[i] = Integer.parseInt(prr[i-1]) - 1;
		}
		for (int i = 0; i < n; i++) {
			int p = parent[i];
			while (p != -1) {
				anc[p][i] = true;
				p = parent[p];
			}
		}
		long count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (anc[i][j] && anc[i][k] && j != k && (a[i] + a[j] + a[k]) >= K) {
						count++;
					}
				}
			}
		}
		System.out.println(count / 2);
	}
}
