import java.io.*;
public class ThreePairwiseMaximums 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while(q != 0)
		{
			q--;
			String s = br.readLine();
			String[] t = s.split(" ");
			int x = Integer.parseInt(t[0]);
			int y = Integer.parseInt(t[1]);
			int z = Integer.parseInt(t[2]);
			
			int max=0;
			for(int i=0;i<t.length;i++)
			{
				if(Integer.parseInt(t[i])>max)
					max = Integer.parseInt(t[i]);
			}
			if(x == y && y == z)
			{
				System.out.println("YES");
				System.out.println(x+" "+y+" "+z);
			}
			else if((x==max && y==max)||(x==max && z==max)||(y==max && z==max))
			{
				System.out.println("YES");
				if(max==x && max==y)
					System.out.println(max+" "+z+" "+z);
				else if(max==x && max==z)
					System.out.println(max+" "+y+" "+y);
				else 
					System.out.println(max+" "+x+" "+x);
			}
			else
				System.out.println("NO");
		}
	}

}
