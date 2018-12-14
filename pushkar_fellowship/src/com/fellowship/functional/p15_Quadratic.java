package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p15_Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:");
		int a = sc.nextInt();
		System.out.println("enter b:");
		int b = sc.nextInt();
		System.out.println("enter c:");
		int c = sc.nextInt();
		utilities.quadratic(a,b,c);
	}

}
