/* IMPORTANT: Multiple classes and nested static classes are supported */
 
import java.util.Scanner;
class TestClass {
    	
	
	static long[] pow2 = new long[100001];
	static int mod = 1000000007;
	    
	public static void main(String[] args) {
	long[] pow2 = new long[100001];
	pow2[0] = 1;
	for (int i=1; i<pow2.length; i++) {
		pow2[i] = pow2[i-1] * 2;
		pow2[i] = pow2[i]%mod;
	}
	
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int totalSetBits = 0;
	long result = 0L;
	while (T-- > 0) {
		int N = sc.nextInt();
		long[] arr = new long[N];
		
		for (int i=0;i<N;i++) {
			arr[i] = sc.nextLong();
		}
		long ans = 0;
		for (int i=0;i<32;i++) {
			
			totalSetBits = 0;
			for (int j=0;j<N;j++) {
				if ((arr[j] & 1<<i) >0) {
					totalSetBits++;
				}
			}
			ans = ans + (pow2[i] * (pow2[totalSetBits]-1))%mod;
			ans = ans%mod;
			
		}
		System.out.println(ans);
	}
	
	}
	
}
