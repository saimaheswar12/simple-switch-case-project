package com.business_layer;

public class Prime{
	public static boolean checkPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public void prime(int num)
	{
		if(checkPrime(num))
			System.out.println(num+" is a prime number");	
		else
			System.out.println(num+" is not a prime number");
	}
	public void nthPrimeNumber(int num)
	{
		int count=0;
		for(int i=1; ;i++)
		{
			if(checkPrime(i))
				count++;
			if(count==num) {
				System.out.println("The "+num+"th prime number is "+i);
			break;
			}
		}
	}
	public void nextPrime(int num)
	{
		for(int i=num+1;;i++)
		{
			if(checkPrime(i))
			{
				System.out.println("The next prime number after " +num+" is "+i);
				break;
			}
		}
	}

}
