import java.util.*;
import java.io.*;
public class WrongSubstraction 
{

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) 
	{
		FastReader sc = new FastReader();
		long n = sc.nextLong();
		int k = sc.nextInt();
		while(k != 0)
		{
			k--;
			if(n%10 != 0)
				n--;
			else 
				n = n/10;
		}
		System.out.println(n);
	}

}
