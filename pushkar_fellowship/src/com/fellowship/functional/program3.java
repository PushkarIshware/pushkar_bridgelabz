package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year:");
		String year = sc.nextLine();
		
		utilities.leap_year(year);
	}

}
