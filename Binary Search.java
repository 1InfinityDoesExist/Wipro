import java.util.*;
import java.lang.*;
import java.io.*;

public class BinarySearch
{
	public int printIndex(ArrayList<Integer> ai , final int key)
	{
		int low = 0;
		int high = ai.size()-1;
		while(low < high)
		{
			int mid = low + (high-low)/2;
			if(ai.get(mid) == key)
			{
				return mid;
			}
			if(ai.get(mid) > key)
			{
				high = mid-1;
			}
			else if(ai.get(mid) < key)
			{
				low = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int _numberOfElements = input.nextInt();
			ArrayList<Integer> ai = new ArrayList<Integer>();
			for(int iter = 0; iter < _numberOfElements; iter++)
			{
				ai.add(input.nextInt());
			}
			Collections.sort(ai);
			int key = input.nextInt();
			BinarySearch bs = new BinarySearch();
			System.out.println(bs.printIndex(ai , key));

		}
	}
}
