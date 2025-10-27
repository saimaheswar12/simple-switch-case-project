package com.business_layer;

public class MagicNumber {
	public static int splitSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}
	public static boolean checkMagicNumber(int num)
	{
		
			while(true) {
				num=splitSum(num);
				if(num<=9)
				{
					if(num==1) 
						return true;
					else 
						return false;
				}
				else continue;
			}
		}
		public void magicNumber(int num)
		{
			if(checkMagicNumber(num))
				System.out.println(num+" is a magic number");
			else
				System.out.println(num+" is not a magic number");
		}
		public void nthMagicNumber(int num)
		{
			int count=0;
			for(int i=1;;i++)
			{
				if(checkMagicNumber(i))
					count++;
				if(count==num) {
					System.out.println("The "+num+"th magic number is "+i);
					break;
				}
			}
		}
	

}
