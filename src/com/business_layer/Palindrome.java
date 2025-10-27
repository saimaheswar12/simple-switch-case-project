package com.business_layer;

/*
 * 1.Palindrome
		1.Check Palindrome
		2.Nth Palindrome
 */
public class Palindrome {
	public static int reverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int ld = num % 10;
			rev = (rev * 10) + ld;
			num = num / 10;
		}
		return rev;
	}

	public static boolean checkPalindrome(int num) {
		int reverse = reverseNumber(num);
		if (num == reverse)
			return true;
		else
			return false;
	}

	public void palindrome(int num) {
		if (checkPalindrome(num))
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");

	}
	public void nthPalindrome(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			if(checkPalindrome(i))
				count++;
			if(count==num)
			{
				System.out.println("The "+num+"th palindrome number is"+i);
				break;
			}
			
		}
	}

}
