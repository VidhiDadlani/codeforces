import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RestoreThePermutationByMerger 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while(q != 0)
		{
			q--;
			int n = Integer.parseInt(br.readLine());
			int ans[] = new int[n];
			String s = br.readLine();
			String[] arr = s.split(" ");
			for(int i=0;i<2*n;i++)
			{
				ans[Integer.parseInt(arr[i])-1]++;
				if(ans[Integer.parseInt(arr[i])-1]==2)
					System.out.print(Integer.parseInt(arr[i])+" ");
			}
			System.out.println();
		}
	}
}