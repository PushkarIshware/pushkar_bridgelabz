package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A8_BubbleIntSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unsorted[]= new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<unsorted.length;i++)
		{
			System.out.println("enter string @ position"+i);
			unsorted[i]=sc.nextInt();
		}
		utilities.BubbleSortInt(unsorted);

		
	}
	}

