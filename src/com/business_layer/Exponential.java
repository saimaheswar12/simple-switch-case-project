package com.business_layer;

public class Exponential {
/*
 * 1.Exponential of Each Digit to Count of Digits
	2.Sum of Exponential of Each Digit to count of Digits
	3.Sum of Exponential of Even Digit to count of Digits
	4.Sum of Exponential of Odd Digit to count of Digits
 */
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
	public void exponentilSumOfEachDigitOfCountOfDigits(int num)
	{
		int temp=num;
		int count=countOfDigits(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			int expo=exponential(ld,count);
			sum=sum+expo;
			num=num/10;
		}
		System.out.println("The sum of Exponential of Each Digit to Count of Digits in "+temp+" is "+sum);
	}
	public void exponentilOfEachDigitOfCountOfDigits(int num)
	{
		int temp=num;
		int count=countOfDigits(num);
		System.out.println("The Exponential of Each Digit to Count of Digits in "+temp+" are ");
		while(num>0)
		{
			int ld=num%10;
			System.out.println(exponential(ld,count));
			num=num/10;
		}
		
	}
	public void exponentilSumOfEachEvenDigitOfCountOfDigits(int num)
	{
		int temp=num;
		int count=countOfDigits(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==0) {
			int expo=exponential(ld,count);
			sum=sum+expo;
			}
			num=num/10;
		}
		System.out.println("The sum of Exponential of Each Even Digit to Count of Digits in "+temp+" is "+sum);
	}
	public void exponentilSumOfEachOddDigitOfCountOfDigits(int num)
	{
		int temp=num;
		int count=countOfDigits(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==1) {
			int expo=exponential(ld,count);
			sum=sum+expo;
			}
			num=num/10;
		}
		System.out.println("The sum of Exponential of Each Odd Digit to Count of Digits in "+temp+" is "+sum);
	}
}
