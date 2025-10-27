package com.business_layer;

public class HappyNumber {
	public static int splitSquare(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum=sum+ld*ld;
			num=num/10;
		}
		return sum;
	}
	public static int checkHappyNumber(int num)
	{
		while(true) {
			num=splitSquare(num);
			if(num<10) {
				if(num==1||num==4) 
					return num;
				else continue;
			}
		}
	}
	public void happyNumber(int num) {
		if(checkHappyNumber(num)==1)
		{
			System.out.println(num+" is a Happy number");
		}
		System.out.println(num+" is a Sadw number");
	}
	public void nthHappyNumber(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			if(checkHappyNumber(i)==1)
				count++;
			if(count==num)
			{
				System.out.println(" The "+num+"th Happy Number is "+i);
				break;
			}
		}
	}

}
