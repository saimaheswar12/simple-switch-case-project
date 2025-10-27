package com.business_layer;

public class HcfAndLcm {
	public void hcf(int num1,int num2) {
		int range;
		if(num1<=num2)
			range=num1;
		else 
			range=num2;
		for(int i=range;i>=1;i--)
		{
			if(num1%i==0&&num2%i==0)
			{
				System.out.println("The Hcf of "+num1+" and "+num2+" is "+i);
				break;
			}
		}
	}
	public void lcm(int num1,int num2) {
		int range;
		if(num1<=num2)
			range=num1;
		else 
			range=num2;
		for(int i=range;i>=1;i--)
		{
			if(num1%i==0&&num2%i==0)
			{
				int lcm=(num1*num2)/i;
				System.out.println("The lcm of "+num1+" and "+num2+" is "+lcm);
				break;
			}
		}
	}
	

}
