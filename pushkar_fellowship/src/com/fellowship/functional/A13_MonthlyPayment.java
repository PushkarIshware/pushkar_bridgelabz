package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A13_MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal amount : ");
		double P = sc.nextInt();
		System.out.println("enter no of years: ");
		double Y = sc.nextInt();
		System.err.println("enter R percent: ");
		double R = sc.nextInt();
		

		utilities.payment(Y,R,P);
	}

}
