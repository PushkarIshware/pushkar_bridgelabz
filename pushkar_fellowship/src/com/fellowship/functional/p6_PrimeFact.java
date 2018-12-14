package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p6_PrimeFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number:");
		int number = sc.nextInt();
		
		utilities.prime_factors(number);
	}

}
