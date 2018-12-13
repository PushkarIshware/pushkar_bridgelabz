package com.fellowship.utilities;
 import java.util.Set;

import com.fellowship.functional.*;

public class utilities {
	 
	
//*******************************Program1*******************************************
	
	public static void name_change(String name) {
		// TODO Auto-generated method stub
		if (name.length()<3)
		{
			System.out.println("Name Should be 3+ letters");
			program1.main(null);
		}
		else 
		{	
		System.out.println("Hello " + name + ", How are you.");
		}
	}
//***************************************************************************

//***************************program2****************************************
	public static void flip_count(int flip) {
		// TODO Auto-generated method stub
		float count=0;
		float tails=0;
		float heads=0;
		
		while(count < flip){
			float head_tail=(float) Math.random();
			if(head_tail<0.5)
			{
				tails++;
			}
			else
			{
				heads++;
			}
			count++;
			}
		System.out.println("t=" +tails+ "h=" +heads);
		
		float hp=heads/flip*100;
		float tp=tails/flip*100;
		
		System.out.println("tail percentage=" +tp+ " %\nhead percentage=" +hp +" %");	
	}
//******************************************************************************************

//*******************************program 3***********************************************
	public static void leap_year(String year) {
		// TODO Auto-generated method stub
		if(year.length()<4)
		{
			System.out.println("enter four digit year");
			program3.main(null);
		}
		else
		{
			int year_int = Integer.parseInt(year);
			if((year_int % 400 == 0) || ((year_int % 4 == 0) && (year_int % 100 != 0)))
			{
				System.out.println("Year " + year + " is a leap year");
			}
			else
			{
				System.out.println("Year " + year + " is not a leap year");
			}
		}
		
	}
	//****************************************************************************************	
	
	public static void power_of(int power) {
		// TODO Auto-generated method stub
		int count=0;
		if (power > 31)
		{
			System.out.println("2^31 overflows an int value.");
			program4.main(null);
		}
		else
		{
			while(count <= power)
			{
				System.out.println("2 to the Power of "+count+" is= "+Math.pow(2, count) +"\n");
				count++;
			}
			
		}
	}
//*********************************************************************************************
	
//***************************Harmonic*********************************************************
	public static void harmonic(int nth) {
		// TODO Auto-generated method stub
		int count=1;
		float nth_value=0;
		
			while(count <= nth)
			{
				nth_value+=1.0/count;
				System.out.println(nth_value);
				count++;
			}
		
		System.out.println(nth_value);
	}
//**********************************************************************************


	
}
