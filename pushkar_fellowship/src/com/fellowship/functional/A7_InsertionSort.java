package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A7_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String unsorted[]= new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<unsorted.length;i++)
		{
			System.out.println("enter string @ position"+i);
			unsorted[i]=sc.nextLine();
		}
		utilities.string_InsertionSort(unsorted);
		
	}

}
