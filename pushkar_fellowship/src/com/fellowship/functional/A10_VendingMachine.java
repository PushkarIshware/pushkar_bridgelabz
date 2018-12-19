package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A10_VendingMachine {
	static int notes[]= {1000,500,100,50,10,5,2,1};
	
	//static int notes[]= {100,1000,200,50,10,5,2,1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter money: ");
		int my_money= sc.nextInt();
		
		utilities.vending(notes,my_money);
		System.out.println(utilities.total_notes);
		//System.out.println("Total Number of Notes are :"+utilities.total_notes);
		
	}	

}
