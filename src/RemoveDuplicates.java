import java.io.*;
import java.util.*;
public class RemoveDuplicates 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String[] a = s.split(" ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(a[i]);
		int[] ans = new int[50];
		int k=0,size=0;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<50;j++)
			{
				if(arr[i] != ans[j] )
				{
					System.out.println(ans[j]+" "+i);
					ans[k] = arr[i];
					k++;
					break;
				}
			}
		}
		for(int i=0;i<50;i++)
		{
			if(ans[i] != 0)
				size++;
		}
		System.out.println(size);
		for(int i=size-1;i>=0;i--)
			System.out.print(ans[i]+" ");
	}

}
