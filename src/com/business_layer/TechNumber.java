package com.business_layer;

public class TechNumber {
	public static int countDigits(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;	
	}
	public static int placeCount(int count)
	{
		int place=1;
		for(int i=1;i<=count/2;i++)
		{
			place=place*10;
		}
		return place;
	}
	public static boolean checkTechNumber(int num)
	{
		int countN=countDigits(num);
		if(countN%2==0)
		{
			int square=num*num;
			int countS=countDigits(square);
			if(countS%2==0)
			{
				int place=placeCount(countS);
				int firstHalf=square/place;
				int secondHalf=square%place;
				int sum=firstHalf+secondHalf;
				if(sum==num)
					return true;
				else
					return false;
				
			}
			else
			{
				return false;
			}
			
		}
		else 
		{
			return false;
		}
	}
	public void techNumber(int num)
	{
		if(checkTechNumber(num))
			System.out.println(num+" is a Tech Number");
		else 
			System.out.println(num+" is not a tech number");
	}

}
