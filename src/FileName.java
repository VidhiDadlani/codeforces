import java.io.*;
import java.util.*;
public class FileName 
{	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String a = "xxx";
		if(s.contains(a))
		{
			while(true)
			{
				s = s.replace(a, "xx");
				if(s.contains(a))
					continue;
				else 
					break;
			}
			System.out.println(n-s.length());
		}
		else
		{
			System.out.println("0");
		}
		
	}

}
