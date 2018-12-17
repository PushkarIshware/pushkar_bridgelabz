package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p8_Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of coupons: ");
		int n = sc.nextInt();
		
		utilities.coupon(n);
}
}
