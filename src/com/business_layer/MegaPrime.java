package com.business_layer;

public class MegaPrime {
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
	public static boolean checkMegaPrime(int num)
	{
		if(checkPrime(num)) {
			while(num>0)
			{
				int ld=num%10;
				if(checkPrime(ld))
					num=num/10;
				else break;
			
			}
			
		}
		else return false;
		return num==0;
		
	}
	public void megaPrime(int num)
	{
		if(checkMegaPrime(num))
			System.out.println(num+" is a mega prime number");
		else
			System.out.println(num+" is not a mega prime number");	
	}
	public void nthMegaPrime(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			if(checkMegaPrime(i))
				count++;
			if(count==num) {
				System.out.println("the "+num+"th mega prime number is "+i );
				break;
			}
		}
	}
	public void nextMegaPrime(int num)
	{
		int count=0;
		for(int i=num+1;;i++)
		{
			if(checkMegaPrime(i))
				count++;
			if(count==num) {
				System.out.println("the next twisted prime number after "+num+" is "+i );
				break;
			}
		}
	}


}
