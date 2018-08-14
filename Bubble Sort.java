import java.io.*;
import java.lang.*;
import java.util.*;

public class BubbleSort
{
	public static<T> T ret(T a, T b)
	{
		return a;
	}

	public void sorting(ArrayList<Integer> ai)
	{
		BubbleSort bb = new BubbleSort();
		boolean swapped = true;
		for(int pass = ai.size()-2; pass >=0 && swapped; pass--)
		{
			swapped = false;
			for(int iter = 0; iter <= pass; iter++)
			{
				if(ai.get(iter) > ai.get(iter+1))
				{
					ai.set(iter, ret(ai.get(iter+1), ai.set(iter+1, ai.get(iter))));
					swapped = true;
				}
			}
		}
		Iterator iter = ai.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		BubbleSort bs = new BubbleSort();
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int _no = input.nextInt();
			ArrayList<Integer> ai = new ArrayList<Integer>();
			for(int iter = 0; iter < _no; iter++)
			{
				ai.add(input.nextInt());
			}
			bs.sorting(ai);

		}
	}
}
