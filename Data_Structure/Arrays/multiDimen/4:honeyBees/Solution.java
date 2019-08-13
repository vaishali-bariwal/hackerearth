import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
 
class HoneyBees {
	static class FastIO {
		private final InputStream is;
		private final byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
 
		public FastIO() {
			this(System.in);
		}
 
		public FastIO(final InputStream is) {
			this.is = is;
		}
 
		public int[] nextArray(final int n) {
			final int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}
 
		public int read() {
			if (numChars == -1) {
				throw new RuntimeException();
			}
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = is.read(buf);
				} catch (final IOException e) {
					throw new RuntimeException();
				}
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}
 
		public String nextLine() {
			return readLine();
		}
 
		public String readLine() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			final StringBuilder sb = new StringBuilder();
			do {
				sb.append(c);
				c = read();
			} while (!isEndOfLine(c));
			return sb.toString();
		}
 
		public String next() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			final StringBuilder sb = new StringBuilder();
			do {
				sb.append(c);
				c = read();
			} while (!isSpaceChar(c));
			return sb.toString();
		}
 
		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public boolean isSpaceChar(final int c) {
			return (c == ' ') || (c == '\n') || (c == '\r') || (c == '\t') || (c == -1);
		}
 
		public boolean isEndOfLine(final int c) {
			return (c == '\n') || (c == '\r') || (c == -1);
		}
	}
 
	public static void main(String[] args) {
 
		FastIO sc = new FastIO();
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] hive = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					hive[i][j] = sc.nextInt();
				}
			}
			int q = sc.nextInt();
			while (q-- > 0) {
				int k = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				int tot = 0;
				if (x - k >= 0) {
					tot += hive[x - k][y];
				}
				if (x + k < n) {
					tot += hive[x + k][y];
				}
				if (y % 2 == 1) {
					if (x - k + 1 >= 0) {
						if (y - 1 >= 0) {
							tot += hive[x - k + 1][y - 1];
						}
						if (y + 1 < m) {
							tot += hive[x - k + 1][y + 1];
						}
					}
					if (x + k < n) {
						if (y - 1 >= 0) {
							tot += hive[x + k][y - 1];
						}
						if (y + 1 < m) {
							tot += hive[x + k][y + 1];
						}
					}
				} else {
					if (x - k >= 0) {
						if (y - 1 >= 0) {
							tot += hive[x - k][y - 1];
						}
						if (y + 1 < m) {
							tot += hive[x - k][y + 1];
						}
					}
					if (x + k - 1 < n) {
						if (y - 1 >= 0) {
							tot += hive[x + k - 1][y - 1];
						}
						if (y + 1 < m) {
							tot += hive[x + k - 1][y + 1];
						}
					}
				}
				if (k == 2) {
					if (y - 2 >= 0) {
						if (x - 1 >= 0) {
							tot += hive[x - 1][y - 2];
						}
						tot += hive[x][y - 2];
						if (x + 1 < n) {
							tot += hive[x + 1][y - 2];
						}
					}
					if (y + 2 < m) {
						if (x - 1 >= 0) {
							tot += hive[x - 1][y + 2];
						}
						tot += hive[x][y + 2];
						if (x + 1 < n) {
							tot += hive[x + 1][y + 2];
						}
					}
				}
				pw.println(tot);
			}
		}
		pw.flush();
	}
 
}
