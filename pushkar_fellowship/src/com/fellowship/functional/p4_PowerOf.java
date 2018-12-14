package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p4_PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter power counter:");
		int power = sc.nextInt();
		
		utilities.power_of(power);
	}

}
