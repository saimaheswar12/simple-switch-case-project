package com.business_layer;

public class TwistedPrime {
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
	public static int reverseNumber(int num) {
		int rev=0;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num/=10;
		}
		return rev;
	}
	public static boolean checktwistedPrime(int num) {
		if(checkPrime(num))
		{
			if(checkPrime(reverseNumber(num)))
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	public void twistedPrime(int num)
	{
		if(checktwistedPrime(num))
			System.out.println(num+" is a twisted Prime");
		else
			System.out.println(num+" is a not twisted Prime");
	}
	public void nthTwistedPrime(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			if(checktwistedPrime(i))
				count++;
			if(count==num) {
				System.out.println("the "+num+"th twisted prime number is "+i );
				break;
			}
		}
	}
	public void nextTwistedPrime(int num)
	{
		int count=0;
		for(int i=num+1;;i++)
		{
			if(checktwistedPrime(i))
				count++;
			if(count==num) {
				System.out.println("the next twisted prime number after "+num+" is "+i );
				break;
			}
		}
	}

}
