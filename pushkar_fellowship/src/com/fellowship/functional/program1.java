package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name:");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		utilities.name_change(name);
	}

}
