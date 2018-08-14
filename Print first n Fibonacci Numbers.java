import java.io.*;
import java.util.*;
import java.lang.*;

public class FibbonacciNumber
{
	long[] fibbo = new long[100];
	public void printFirstNfibbo()
	{
		fibbo[0] = fibbo[1] = 1;
		for(int iter = 2; iter < 100; iter++)
		{
			fibbo[iter] = fibbo[iter-1] + fibbo[iter-2];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		FibbonacciNumber fn = new FibbonacciNumber();
		fn.printFirstNfibbo();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			for(int iter = 0; iter < n; iter++)
			{
				System.out.print(fn.fibbo[iter] + " ");
			}
			System.out.println();

		}
	}
}
