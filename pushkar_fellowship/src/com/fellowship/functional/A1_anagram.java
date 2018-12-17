package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A1_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1= sc.nextLine();
		System.out.println("enter 2st string");
		String s2= sc.nextLine();
		utilities.anagram(s1,s2);
	}

}
