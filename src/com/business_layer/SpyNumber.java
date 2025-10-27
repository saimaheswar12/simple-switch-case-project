package com.business_layer;

public class SpyNumber {
	public static boolean checkSpyNumber(int  num) {
		int sum=0;
		int product=1;
		while(num>0) {
			int ld=num%10;
			sum=sum+ld;
			product=product*ld;
			num=num/10;
		}
		return sum==product;
	}
	public void spyNumber(int num) {
		if(checkSpyNumber(num))
			System.out.println(num+" is a spy number");
		else
			System.out.println(num+" is not a spy number");
	}

}
