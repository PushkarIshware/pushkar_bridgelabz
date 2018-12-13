package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter flip count:");
		int flip = sc.nextInt();
		
		utilities.flip_count(flip);
	}

}
