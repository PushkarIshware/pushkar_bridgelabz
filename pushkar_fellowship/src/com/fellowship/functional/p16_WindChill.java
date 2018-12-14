package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p16_WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter t:");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println("Enter v:");
		int v = sc.nextInt();

		utilities.windchill(t,v);
	}

}
