/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public boolean hey(ArrayList<Integer> A, final int _sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int iter = 0; iter < A.size(); iter++)
        {
            int rem = _sum - A.get(iter);
            if(hm.containsKey(rem))
            {
                return true;
            }
            hm.put(A.get(iter), 1);
        }
        return false;
    }
	public static void main (String[] args)
	{
		//code
		Scanner input = new Scanner(System.in);
		GFG gfg = new GFG();
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
		    int n = input.nextInt();
		    int _sum = input.nextInt();
		    ArrayList<Integer> ai = new ArrayList<Integer>();
		    for(int iter = 0; iter < n; iter++)
		    {
		        ai.add(input.nextInt());
		    }
		    if(gfg.hey(ai, _sum))
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}
	}
}
