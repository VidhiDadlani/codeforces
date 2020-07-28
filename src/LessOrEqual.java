import java.io.*;
import java.util.*;
public class LessOrEqual 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] ss = s.split(" ");
		//int n = Integer.parseInt(br.readLine());
		//int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(ss[0]);
		int k = Integer.parseInt(ss[1]);
		String a = br.readLine();
		String aa[] = a.split(" ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(aa[i]);
		Arrays.sort(arr);
		int ans=0;
		if(n==k)
			ans = arr[n-1];
		else if(arr[k-1]==arr[k])
			ans = -1;
		else
			ans = arr[k-1];
		//System.out.println(ans);
		if(ans>=1 && ans<=1000000000)
			System.out.println(ans);
		else 
			System.out.println("-1");
	}

}
