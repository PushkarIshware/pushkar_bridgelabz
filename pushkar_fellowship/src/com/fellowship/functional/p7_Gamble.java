package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p7_Gamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter stake:");
		int s = sc.nextInt();
		System.out.println("enter goals:");
		int g = sc.nextInt();
		System.out.println("enter trial:");
		int t = sc.nextInt();
		
		utilities.gamble(s,g,t);
	}

}
