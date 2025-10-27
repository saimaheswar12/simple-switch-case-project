package com.business_layer;

public class Fibonacci {
	public void fibonacciSeries(int n)
	{
		int a=0,b=1,c=0;
		System.out.println("The first "+n+" fibonacci terms are");
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	public void nthFibonacciSeries(int n)
	{
		int a=0,b=1,c=0;
		System.out.println("The "+n+"th fibonacci term is");
		for(int i=1;i<=n-1;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}

}
