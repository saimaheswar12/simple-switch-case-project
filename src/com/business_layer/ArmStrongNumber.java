package com.business_layer;

public class ArmStrongNumber {
	public static int countOfDigits(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int exponential(int base,int power)
	{
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		return expo;
	}
	public static int exponentialSum(int num)
	{
		int count=countOfDigits(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+exponential(ld,count);
			num=num/10;
		}
		return sum;
	}
	public static boolean checkArmStrongNumber(int num)
	{
		int sum=exponentialSum(num);
		if(sum==num)
			return true;
		else return false;
	}
	public void armstrongNumber(int num)
	{
		if(checkArmStrongNumber(num))
			System.out.println(num+" is an ArmStromng Number");
		else
			System.out.println(num+" is not an Armstrong number");
	}
	public void nthArmStrongNumber(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			if(checkArmStrongNumber(i))
				count++;
			if(count==num) {
				System.out.println("The "+num+"th ArmStrong Number is "+i);
			break;}
		}
	}

}
