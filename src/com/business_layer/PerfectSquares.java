package com.business_layer;

public class PerfectSquares {
	public void perfectSquares(int n)
	{
		System.out.println(" The first "+n+" perfect squares are");
		for(int i=1;i<=n;i++) {
			int ps=i*i;
			System.out.print(ps+" ");
		}
		System.out.println();
	}
	public void nthPerfectSquare(int n)
	{
				System.out.println("the "+n+" th perfect square is "+n*n);
				
	}

}
