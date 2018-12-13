package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of x:");
		int x = sc.nextInt();
		System.out.println("enter value of y:");
		int y = sc.nextInt();
		utilities.distance(x,y);
	}
	

}
