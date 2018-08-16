import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public String reverseSentense(String str)
	{
		char[] s = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		while(start < end)
		{
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		String sk = new String(s);
		return sk;
	}
	public static void main(String[] args) throws  IOException
	{
		GFG gfg = new GFG();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int testCase = Integer.parseInt(br.readLine());
		for(int iter = 1; iter <= testCase; iter++)
		{
			String str = br.readLine();
			System.out.println(gfg.reverseSentense(str));
		}
	}
}
