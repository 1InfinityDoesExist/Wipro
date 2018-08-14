import java.io.*;
import java.util.*;
import java.lang.*;

public class GCD
{

	public int gcdHCF(int a, int b)
	{
		if(a == 0)
		{
			return b;
		}
		return gcdHCF(b%a, a);
	}
	public int gcdLCM(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		return gcdLCM(b, a%b);
	}
	public int HCF(ArrayList<Integer> A)
	{
		int result = A.get(0);
		for(int iter = 1; iter < A.size(); iter++)
		{
			result = gcdHCF(result, A.get(iter));
		}
		return result;
	}
	public int LCM(ArrayList<Integer> A)
	{
		int result = A.get(0);
		for(int iter = 1; iter < A.size(); iter++)
		{
			result = (result *A.get(iter))/(gcdLCM(result, A.get(iter)));
		}
		return result;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		GCD g = new GCD();
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int _no = input.nextInt();
			ArrayList<Integer> ai = new ArrayList<Integer>();
			for(int iter = 0; iter < _no; iter++)
			{
				ai.add(input.nextInt());
			}
			System.out.println(g.HCF(ai));
			System.out.println(g.LCM(ai));
		}
	}
}
