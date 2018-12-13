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
			System.err.println("2^31 overflows an int value.");
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

	public static void prime_factors(int number) {
		 System.out.print("The prime factorization of " + number + " is: ");

        // for each potential factor
        for (long factor = 2; factor*factor <= number; factor++) {

            // if factor is a factor of n, repeatedly divide it out
            while (number % factor == 0) {
                System.out.print(factor + " "); 
                number = (int) (number / factor);
            }
        }

        // if biggest factor occurs only once, n > 1
        if (number > 1) 
        	{System.out.println(number);}
        else       {System.out.println();}
    }
//***************************************************************************
	
//*****************************Gamble**********************************************
	public static void gamble(int s, int g, int t) {
		// TODO Auto-generated method stub
		int wins=0;
		int bets=0;
		
		for(int i=0; i<=t; i++) 
		{
			int cash = s;
            while (cash > 0 && cash < g) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == g) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + t);
        System.out.println("Percent of games won = " + 100.0 * wins / t);
        System.out.println("Avg # bets           = " + 1.0 * bets / t);
    }
//*********************************************************************************

	
//********************************sum of triplets************************************************
	public static void sum_of(int[] arr) {
		// TODO Auto-generated method stub
		boolean found = false;
		int n=arr.length;
		for (int i=0; i<n-2; i++) 
	    { 
	        for (int j=i+1; j<n-1; j++) 
	        { 
	            for (int k=j+1; k<n; k++) 
	            { 
	                if (arr[i]+arr[j]+arr[k] == 0) 
	                { 
	                    System.out.print(arr[i]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[j]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[k]); 
	                    System.out.print("\n"); 
	                    found = true; 
	                } 
	            } 
	        } 
	    } 
	  
	    // If no triplet with 0 sum found in array 
	    if (found == false) 
	        System.out.println(" not exist "); 
	  
	} 
}
