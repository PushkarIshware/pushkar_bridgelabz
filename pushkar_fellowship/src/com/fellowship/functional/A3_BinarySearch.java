package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A3_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key value:");
		/*int data[]= {1,6,17,22,45};
		
		int key = sc.nextInt();
		utilities.BinarySearch(data, key);*/
		
		String data_string[]= {"hey","hello","hola","pushkar","janu","nik"};
		String key1=sc.nextLine();
		utilities.StringBinarySort(data_string,key1);
		
	}

}
