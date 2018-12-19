package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A12_Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1: fahrenheit to Celsius"
						+ " \n 2: Celsius to fahrenheit ");
		String choice = sc.nextLine();
		switch(choice)
		{
		case "1":
		    System.out.println("enter temp in fahrenheit: ");
		    float f = sc.nextInt();
		    utilities.Fahrenheit_to_Celsius(f);
		   
		    break;
		   
		case "2":
		    System.out.println("enter temp in Celsius: ");
		    float c = sc.nextInt();
		    utilities.Celsius_to_Fahrenheit(c);
		   
		    break;
		   
		    default:
		    System.out.println("invalid");
		}
	}

}
