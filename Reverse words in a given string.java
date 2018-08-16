/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public String reverseString(String st)
	{
		char[] ch = st.toCharArray();
		int start = 0;
		int end = st.length()-1;
		while(start < end)
		{
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		return new String(ch);
	}
	public String reverseWordOfSentense(String str)
	{
		Stack<String> st = new Stack<String>();
		String s = "";
		for(int iter = 0; iter < str.length(); iter++)
		{
			if(str.charAt(iter) == '.')
			{
				if(s.length() == 0)
				{
					continue;
				}
				else
				{
					//st.push(reverseString(s));
					st.push(s);
					s = "";
				}
			}
			else
			{
				s = s + str.charAt(iter);
				if(iter == str.length()-1)
				{
					st.push(s);
				}
			}
		}
		str = "";
		while(!st.empty())
		{
			if(st.size() == 1)
			{
				str = str + st.peek();
				return str;
			}
			str = str + st.peek();
			str = str + ".";
			st.pop();
		}
		return str;
	}
	public static void main (String[] args) throws IOException
	{
		GFG gfg = new GFG();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0)
		{
			String str = br.readLine();
			System.out.println(gfg.reverseWordOfSentense(str));
		}
	}
}
