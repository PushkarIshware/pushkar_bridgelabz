package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A5_GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of questions ?:");
		int n= sc.nextInt();
		int hi=(int) Math.pow(2, n);
		int low=0;
		System.out.println("enter int between 0 AND "+(hi-1));
		
		int your_no=utilities.Guess_number(0, hi);
		System.out.println("Your Number is : "+your_no);
	}

}
