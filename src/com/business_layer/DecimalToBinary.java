package com.business_layer;

public class DecimalToBinary {
	public void decimalToBinaryConversion(int num)
	{
		int temp=num;
		int placeValue=1;
		int binary=0;
		while(num>0) {
			int rem=num%2;
			binary=binary+(rem*placeValue);
			placeValue=placeValue*10;
			num=num/2;	
		}
		System.out.println("The binary value of "+temp+" is "+binary);
	}
	public void binaryToDecimalConversion(int num)
	{
		int temp=num;
		int sum=0;
		int power=0;
		if(num>0)
		{
			while(num>0)
			{
				int rem=num%10;
				if(rem==1) {
					int pow=1;
					for(int i=1;i<=power;i++) {
						pow=pow*2;
					}
					sum=sum+pow;
				}
				power++;
				num=num/10;
			}
			System.out.println("Decimal value of "+temp+" is "+sum);
		}
		else
			System.out.println("Decimal value is 0");
	}

}
