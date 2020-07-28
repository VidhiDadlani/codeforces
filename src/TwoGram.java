import java.io.*;
import java.util.*;
public class TwoGram 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		Map<String,Integer> hm = new HashMap<String,Integer>();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			if(Math.abs(arr[i]-arr[i+1])==1)
			{
				String t = String.valueOf(arr[i])+String.valueOf(arr[i+1]);
				
			}
				
		}
	}

}
