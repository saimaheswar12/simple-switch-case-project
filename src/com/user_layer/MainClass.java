package com.user_layer;

import java.util.Scanner;
import com.business_layer.*;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean condn = true;
		while (condn) {
			System.out.println("select the operation:-");
			System.out.println("1.Factorial");
			System.out.println("2.Factors");
			System.out.println("3.Prime");
			System.out.println("4.Digits");
			System.out.println("5.Exponential");
			System.out.println("6.Advance");
			System.out.println("7.Exit");
			System.out.println("Enter the option..");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				boolean choiceCondition = true;
				Factorial fact = new Factorial();
				while (choiceCondition) {
					System.out.println("Select the operation");
					System.out.println("1.Find the factorail");
					System.out.println("2.Sum of the factorial of each digit..");
					System.out.println("3.sum of the factorial of even digit ..");
					System.out.println("4.Sum Of the factorail of Prime digit ..");
					System.out.println(" Enter the choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int factorial = fact.findFactorial(num);
						System.out.println(factorial);
					} else if (choice == 2) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int sumofFactorial = fact.SumOfFactorial(num);
						System.out.println("The Sum of Factorial of Each Digit in " + num + " is " + sumofFactorial);
					} else if (choice == 3) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int sumofEvenFactorial = fact.sumOfEvenDigitsFactorial(num);
						if (sumofEvenFactorial != 0)
							System.out.println(
									"The Sum of Factorial of Each Even Digit in " + num + " is " + sumofEvenFactorial);
						else
							System.out.println("No Even Digits in " + num);
					} else if (choice == 4) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int sumofPrimeFactorial = fact.sumOfFactorialOfPrime(num);
						System.out.println(
								"The Sum of Factorial of Each Prime Digit in " + num + " is " + sumofPrimeFactorial);
					} else {
						System.out.println("Invalid choice");
						choiceCondition = false;
					}
				}
			}
				break;
			case 2: {
				boolean choiceCondition = true;
				Factors factor = new Factors();
				while (choiceCondition) {
					System.out.println("Select the operation");
					System.out.println("1.Print the Factors Of a number");
					System.out.println("2.Sum of the factors of number..");
					System.out.println("3.product of the factors of a number ..");
					System.out.println("4.factors of each digit in the number..");
					System.out.println(" Enter the choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						factor.factors(num);
					} else if (choice == 2) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int sumofFactors = factor.sumOfFactors(num);
						System.out.println("The Sum of Factorial of Each Digit in " + num + " is " + sumofFactors);
					} else if (choice == 3) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int productOfFactors = factor.productOfFactors(num);
						System.out.println(
								"The Sum of Factorial of Each Even Digit in " + num + " is " + productOfFactors);
					} else if (choice == 4) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						factor.factorsOfEachDigit(num);
					} else {
						System.out.println("Invalid choice");
						choiceCondition = false;
					}
				}

			}
				break;
			case 3: {
				boolean condition = true;
				while (condition) {
					System.out.println("Select the option");
					System.out.println("1.Prime");
					System.out.println("2.Twisted Prime");
					System.out.println("3.Mega Primer");
					System.out.println(" Enter the option..");
					int primeoption = sc.nextInt();
					switch (primeoption) {
					case 1: {
						boolean choiceCondition = true;
						Prime prime = new Prime();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.check prime or not");
							System.out.println("2.Nth prime number");
							System.out.println("3.Next Prime number");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								prime.prime(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								prime.nthPrimeNumber(num);
							} else if (choice == 3) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								prime.nextPrime(num);
							} else {
								System.out.println("Invalid choice");
								choiceCondition = false;
							}
						}

					}
						break;
					case 2: {
						boolean choiceCondition = true;
						TwistedPrime prime = new TwistedPrime();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.check twisted prime or not");
							System.out.println("2.Nth  twisted prime number");
							System.out.println("3.Next twisted Prime number");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								prime.twistedPrime(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								prime.nthTwistedPrime(num);
							} else if (choice == 3) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								prime.nextTwistedPrime(num);
							} else {
								System.out.println("Invalid choice");
								choiceCondition = false;
							}
						}

					}
						break;
					case 3: {
						boolean choiceCondition = true;
						MegaPrime prime = new MegaPrime();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.check mega prime or not");
							System.out.println("2.Nth  mega prime number");
							System.out.println("3.Next mega Prime number");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								prime.megaPrime(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								prime.nthMegaPrime(num);
							} else if (choice == 3) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								prime.nextMegaPrime(num);
							} else {
								System.out.println("Invalid choice");
								choiceCondition = false;
							}
						}

					}
						break;
					case 4: {
						condition = false;
					}
					default: {
						System.out.println("Invalid option");
					}
					}
				}

			}
				break;
			case 4: {
				boolean choiceCondition = true;
				Digits digit = new Digits();
				while (choiceCondition) {
					System.out.println("Select the operation");
					System.out.println("1.Sum of the Digits");
					System.out.println("2.Product of the Digits");
					System.out.println("3.Sum of even digits");
					System.out.println("4.Sum of mean and extreme digits");
					System.out.println(" Enter the choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int sumOfDigits = digit.sumOfDigits(num);
						System.out.println("The sum of the digits in " + num + " is " + sumOfDigits);
					} else if (choice == 2) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int productOfDigits = digit.productOfDigits(num);
						System.out.println("The product of the digits in " + num + " is " + productOfDigits);
					} else if (choice == 3) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						int evenDigitsSum = digit.sumOfEvenDigits(num);
						System.out.println("The product of the digits in " + num + " is " + evenDigitsSum);
					} else if (choice == 4) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						digit.sumOfMeanansExtremeDigits(num);
					} else {
						System.out.println("Invalid choice");
						choiceCondition = false;
					}
				}

			}
				break;
			case 5: {
				boolean choiceCondition = true;
				Exponential expo = new Exponential();
				while (choiceCondition) {
					System.out.println("Select the operation");
					System.out.println("1.Exponential of Each Digit to Count of Digits");
					System.out.println("2.Sum of Exponential of Each Digit to count of Digits");
					System.out.println("3.Sum of Exponential of Even Digit to count of Digits");
					System.out.println("4.Sum of Exponential of Odd Digit to count of Digits");
					System.out.println(" Enter the choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						expo.exponentilOfEachDigitOfCountOfDigits(num);
					} else if (choice == 2) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						expo.exponentilSumOfEachDigitOfCountOfDigits(num);
					} else if (choice == 3) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						expo.exponentilSumOfEachEvenDigitOfCountOfDigits(num);
					} else if (choice == 4) {
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						expo.exponentilSumOfEachOddDigitOfCountOfDigits(num);
					} else {
						System.out.println("Invalid choice");
						choiceCondition = false;
					}
				}

			}
				break;
			case 6: {
				boolean advanceCondn = true;
				while (advanceCondn) {
					System.out.println("select the operation:-");
					System.out.println("1.Palindrome");
					System.out.println("2.Spy");
					System.out.println("3.Armstrong");
					System.out.println("4.Tech Number");
					System.out.println("5.Magic Number");
					System.out.println("6.Happy Number");
					System.out.println("7.HCF and LCM");
					System.out.println("8.Decimal-Binary");
					System.out.println("9.Series terms");
					System.out.println("Enter the option..");
					int advanceOption = sc.nextInt();
					switch (advanceOption) {
					case 1: {
						boolean choiceCondition = true;
						Palindrome palindrome = new Palindrome();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.Check Palindrome or not");
							System.out.println("2.Nth palindrome number");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								palindrome.palindrome(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								palindrome.nthPalindrome(num);
							} else {
								choiceCondition = false;
							}
						}
					}
						break;
					case 2: {
						SpyNumber spyNumber = new SpyNumber();
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						spyNumber.spyNumber(num);

					}
						break;
					case 3: {
						boolean choiceCondition = true;
						ArmStrongNumber armstrong = new ArmStrongNumber();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.check ArmStrong Number or not");
							System.out.println("2.Nth ArmStrong Number");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								armstrong.armstrongNumber(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								armstrong.nthArmStrongNumber(num);
							} else {
								choiceCondition = false;
							}
						}

					}
						break;
					case 4: {
						TechNumber tech = new TechNumber();
						System.out.println("Enter a number:-");
						int num = sc.nextInt();
						tech.techNumber(num);

					}
						break;
					case 5: {
						boolean choiceCondition = true;
						MagicNumber magic = new MagicNumber();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.Magic Number or Not");
							System.out.println("2.Nth magic Number");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								magic.magicNumber(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								magic.nthMagicNumber(num);
							} else {
								choiceCondition = false;
							}
						}

					}
						break;
					case 6: {
						boolean choiceCondition = true;
						HappyNumber happy = new HappyNumber();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.Happy Number or Not");
							System.out.println("2.Nth Happy Number");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								happy.happyNumber(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								happy.nthHappyNumber(num);
							} else {
								choiceCondition = false;
							}
						}

					}
						break;
					case 7: {
						boolean choiceCondition = true;
						HcfAndLcm hcflcm = new HcfAndLcm();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.HCF");
							System.out.println("2.LCM");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number1:-");
								int num1 = sc.nextInt();
								System.out.println("Enter a number2:-");
								int num2 = sc.nextInt();
								hcflcm.hcf(num1, num2);

							} else if (choice == 2) {
								System.out.println("Enter a number1:-");
								int num1 = sc.nextInt();
								System.out.println("Enter a number2:-");
								int num2 = sc.nextInt();
								hcflcm.lcm(num1, num2);
							} else {
								choiceCondition = false;
							}
						}

					}
						break;
					case 8: {
						boolean choiceCondition = true;
						DecimalToBinary binary = new DecimalToBinary();
						while (choiceCondition) {
							System.out.println("Select the operation");
							System.out.println("1.Decimal to binary conversion");
							System.out.println("2.binary to decimal conversion");
							System.out.println(" Enter the choice..");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter a number:-");
								int num = sc.nextInt();
								binary.decimalToBinaryConversion(num);
							} else if (choice == 2) {
								System.out.println("Enter n value:-");
								int num = sc.nextInt();
								binary.binaryToDecimalConversion(num);
							} else {
								choiceCondition = false;
							}
						}

					}
						break;
					case 9: {
						boolean seriesConditon = true;
						while (seriesConditon) {
							System.out.println("Select the operation");
							System.out.println("1.Fibonacci");
							System.out.println("2.perfectSquares");
							System.out.println(" Enter the option..");
							int seriesOption = sc.nextInt();
							switch (seriesOption) {
							case 1: {
								boolean choiceCondition = true;
								Fibonacci fibonacci=new Fibonacci();
								while (choiceCondition) {
									System.out.println("Select the operation");
									System.out.println("1.First n fibanacci terms");
									System.out.println("2.nth fibonacci term");
									System.out.println(" Enter the choice..");
									int choice = sc.nextInt();
									if (choice == 1) {
										System.out.println("Enter n value:-");
										int n = sc.nextInt();
										fibonacci.fibonacciSeries(n);
									} else if (choice == 2) {
										System.out.println("Enter n value:-");
										int n = sc.nextInt();
										fibonacci.nthFibonacciSeries(n);
									} else {
										choiceCondition = false;
									}
								}

							}
								break;
							case 2: {
								boolean choiceCondition = true;
								PerfectSquares squares=new PerfectSquares();
								while (choiceCondition) {
									System.out.println("Select the operation");
									System.out.println("1.first n perfect square terms");
									System.out.println("2.Nth perfect square term");
									System.out.println(" Enter the choice..");
									int choice = sc.nextInt();
									if (choice == 1) {
										System.out.println("Enter n value:-");
										int n = sc.nextInt();
										squares.perfectSquares(n);
									} else if (choice == 2) {
										System.out.println("Enter n value:-");
										int n = sc.nextInt();
										squares.nthPerfectSquare(n);
									} else {
										choiceCondition = false;
									}
								}
							}
								break;
							default: {
								seriesConditon = false;
							}
							}
						}

					}
					break;

					default: {
						advanceCondn = false;
					}

					}

				}
			}
				break;
			case 7: {
				condn = false;
				System.out.println("Thank You...");
			}
				break;
			default: {
				System.out.println("Invalid option..");
			}
			}
		}
		sc.close();

	}

}
