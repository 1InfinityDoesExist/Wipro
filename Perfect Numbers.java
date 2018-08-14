import java.lang.*;
import java.util.*;
import java.io.*;

public class PerfectNumber 
{
	public boolean isPerfectNumber(final int N)
	{
		final int cp = N;
		long sum = 1;
		for(int iter = 2; iter <= Math.sqrt(N) ; iter++)
		{
			if(N % iter == 0)
			{
				sum = sum + iter + N/iter;
			}
		}
		if(sum == N  && N != 1)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int N = input.nextInt();
			PerfectNumber pn = new PerfectNumber();
			if(pn.isPerfectNumber(N))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
	}
}
