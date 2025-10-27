package com.business_layer;

/*
1.Sum of Digits
	2.Product of Digits
	3.Sum of Even Digits
	4.Sum of Extreme and Mean Digits
 */
public class Digits {
	public int sumOfDigits(int num)
	{
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}
	public int productOfDigits(int num)
	{
		int product=1;
		while(num>0) {
			int ld=num%10;
			product=product*ld;
			num=num/10;
		}
		return product;
	}
	public int sumOfEvenDigits(int num)
	{
		int sum=0;
		while(num>0) {
			int ld=num%10;
			if(ld%2==0)
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}
	public void sumOfMeanansExtremeDigits(int num)
	{
		int temp=num;
		int lastDigit=num%10;
		num=num/10;
		int sum=0;
		while(num>9) {
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		int sumOfMeanDigits=sum;
		int sumOfExtremeDigits=lastDigit+num;
		System.out.println("The sum of the mean digits in "+temp+" is "+sumOfMeanDigits);
		System.out.println("The sum of the extreme digits in "+temp+" is "+sumOfExtremeDigits);
		
	}
	

}
