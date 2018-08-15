import java.util.*;
import java.io.*;
import java.lang.*;

public class Pattern
{
	public void designPattern(final int n)
	{
		for(int iter = 1; iter <= n; iter++)
		{
			if(iter%2 == 0)
			{
				for(int jter = 0; jter <= n; jter++)
				{
					if(jter == 0)
					{
						System.out.print(iter+1);
					}
					else
					{
						System.out.print(iter);
					}
				}
				System.out.println();
			}
			else
			{
				for(int jter = 0; jter <= n; jter++)
				{
					if(jter == n)
					{
						System.out.print(iter+1);
					}
					else
					{
						System.out.print(iter);
					}
				}
				System.out.println();
			}
		}
		return;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Pattern p = new Pattern();
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			p.designPattern(n);
		}
	}
}
