 package com.casio.scientificcalculator;

import java.util.*;

public class Switch_Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	  // Create an Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a fisrt value");
		int a = sc.nextInt();
		
		System.out.println("Enter a second value");
		int b = sc.nextInt();
		
		System.out.println("Store first value in :" + a);
		System.out.println("Store second value in :" + b);
		
		int addition = a+b;
		int subtraction = a-b;
		int multiplication = a*b;
		int division = a/b;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a Arthimethic Operation No");
		int Function_No = sc1.nextInt();
		System.out.println("Store Arthimethic Operation No  in :" + Function_No);
		
		switch (Function_No) {
		case 1 :
			System.out.println("Addition is :" + addition);
			break;
			
		case 2 :
			System.out.println("Subtraction is :" + subtraction);
			break;
			
		case 3 :
			System.out.println("Multiplication is :" + multiplication);
			break;
			
		case 4 :
			System.out.println("Division is :" + division);
			break;
			
		default :
			System.out.println("Invalid Number");
			
		}
	 }
  }
