package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Nth Harmonic value:");
		int number = sc.nextInt();
		
		utilities.harmonic(number);
	}

}
