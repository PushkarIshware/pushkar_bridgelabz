package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p7_Gamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter stake:");
		int stack = sc.nextInt();
		System.out.println("enter goals:");
		int goal = sc.nextInt();
		//System.out.println("enter trial:");
		//int t = sc.nextInt();
		//utilities.gamble(s,g,t);
		
		int bet =0;
		int win=0;
		int loss=0;
		//int nw=0;
		//int nl=0;
		int cash=stack;
		
		while(cash <= goal || cash == 0)
		{	
			bet++;
			if (Math.random() < 0.5)
			{
				win++;

				cash+=10;
				
				if (cash==goal) {
				
					System.out.println("wins"+win+"\n bets"+bet);
					System.out.println(cash);
				
				}
			
				

			}
			
			//System.out.println(cash);
				
		}
		
		
		

}}
