package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A11_DayofWeek {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("date:");
		int date=sc.nextInt();
		System.out.println("month:");
		int month=sc.nextInt();
		System.out.println("year:");
		int year=sc.nextInt();
		utilities.DOW(date,month,year);
}
	}
