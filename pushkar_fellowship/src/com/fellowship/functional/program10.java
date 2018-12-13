package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length:");
		int len = sc.nextInt();
		int arr[] = {0, -1, 2, -3, 1}; 
	    int n =arr.length; 
		utilities.sum_of(arr,len);
	}

}
