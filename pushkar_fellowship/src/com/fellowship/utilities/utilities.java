package com.fellowship.utilities;
import java.util.Arrays;
import java.util.Random;
 import java.util.Set;
import java.util.Timer;

import javax.sound.midi.Soundbank;
import javax.swing.text.Utilities;

import com.fellowship.functional.*;

import java.awt.Window.Type;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class utilities {
	 
	
//*******************************Program1*******************************************
	
	public static void name_change(String name) {
		// TODO Auto-generated method stub
		if (name.length()<3)
		{
			System.out.println("Name Should be 3+ letters");
			p1_Replace.main(null);
		}
		else 
		{	
			String s1="Hello <<UserName>>, How are you?";
			                     
			String news1=s1.replace("<<UserName>>",name);
			System.out.println(news1);
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
			p3_Leapyear.main(null);
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
			p4_PowerOf.main(null);
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
//************************************************************************
	
//*****************************DISTANCE************************************
	public static void distance(int x, int y) {
		// TODO Auto-generated method stub
		float Euclidean_distance=(float) Math.pow((x*x + y*y), 0.5);
		System.out.println("Euclidean distance is: "+Euclidean_distance);
	}

	//********************************************************************************
	//************************quadratic***********************************************
	
	public static void quadratic(int a, int b, int c) {
		// TODO Auto-generated method stub
		double delta = b*b-4*a*c;
		double x_1=(-b + Math.sqrt(delta))/(2*a);
		double x_2=(-b - Math.sqrt(delta))/(2*a);
		System.out.println(delta);
		System.out.println("Root 1 of x= "+x_1+ "\n Root 2 of x="+x_2);
	}
//************************************************************************
	
//****************************Windchill****************************************
	

	public static void windchill(int t, int v) {
		// TODO Auto-generated method stub
		if (t>50 || 3 < v && v > 120)
		{
			System.err.println("invalid results becouse of high t and v values");
		}
		else
		{
			double w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v, 0.16));
			System.out.println("the wind chill is: "+ w);
		}
	}

	
//*********************************************************************************
	
//*******************************2Dmetrix**************************************************
	public static void int2read(int a2d[][]) {
		// TODO Auto-generated method stub
        PrintWriter pw = new PrintWriter(System.out);

		for (int r=0; r<a2d.length; r++)
		{
			for (int c=0; c<a2d.length; c++)
			{
				int z=a2d[r][c];
			//System.out.print(a2d[r][c]+"\t");
			//System.out.print(z+"\t");
			pw.print(z+"\t");
			}
			pw.println();
			//System.out.println();
			pw.flush();
		}
		
		
	}
//****************************************************************************
	//*************************STOPWATCH*************************************************
	private static long startTimer = 0;
    private long stopTimer = 0;
    private long elapsed;
   
    public static void start() {
        utilities u=new utilities();
        Scanner sc=new Scanner(System.in);
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
        System.out.println("Press 1 to stop");
        int st=sc.nextInt();
        if (st==1) {
            u.stop();
            u.elapsed();
        }
        
    }
    public void stop() {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
       
    }
    public void elapsed() {
        elapsed=stopTimer-startTimer;
        System.out.println("time Elapsed :"+elapsed/1000 +" in Secs");
    }
//****************************************************************************
//**************************COUPON******************************************
	
    public static void coupon(int n) {
		// TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
    	int arr[];
    	arr = new int[n];
    	
    	for (int dc=0;dc<n; dc++)
		{
			System.out.println("enter values["+dc+":");
			
			int p1=sc.nextInt();
			arr[dc]=p1;	
		}
    	
    	for (int dc=0;dc<n;dc++)
    	{
    		System.out.print(arr[dc]+" ");
    	}
    	
    	Random rand = new Random();
    	
    	
    
			}
//****************************************************************
	public static void permute() {
		// TODO Auto-generated method stub		
		/*
		String temp=a2;
		a2=a3;
		a3=temp;
		
		System.out.println(a1+" "+a2+" "+a3);*/
		
		String data = "ABC";
		for(int i=0;i<=data.length();i++)
		{
			for (int j=0;j<i;j++)
					{
				System.out.println();
					}
			
		}	
	}
	//************************************************************
	//*******************TTT*************************************
	private static final int EMPTY=0;
	private static final int none=0;
	private static final int USER=1;
	private static final int COMPUTER=2;
	private static int stalement=3;
	public static void TTT() {
		// TODO Auto-generated method stub
		
		
		   
		        int turn = COMPUTER;
		        int[][] board = new int[3][3];
		        int move,winner;
		       
		        print_board(board);
		        while(true) {
		            if(turn == USER) {
		            System.out.println("Your move");
		            move = -1;
		            while (move<0 || move>8 || board[move/3][move%3] != EMPTY) {
		                System.out.println("Please enter your move(0-8): ");
		                Scanner sc = new Scanner(System.in);
		                move = sc.nextInt();
		               
		                if(move>8)
		                {
		                    System.out.println("enter move between 0-8");
		                }
		               
		            }
		            } else {
		            move = computer_move(board);
		            System.out.println("Computer move: " + move);
		            }

		         
		            board[(int)(move/3)][move%3] = turn;

		          
		            print_board(board);

		            winner = checkWinner(board);

		            if(winner != none)
		            break;

		            if(turn == USER) {
		            turn = COMPUTER;
		            } else {
		            turn = USER;
		            }

		        }
		       
		        switch(winner) {
		        case USER:
		            System.out.println("You won!");
		            break;
		        case COMPUTER:
		            System.out.println("Computer won!");
		            break;
		        default:
		            System.out.println("Tie!");
		            break;
		        }
	
		        }
		    public static void print_board(int[][] board) {
		        System.out.print(printChar(board[0][0]));
		        System.out.print("|");
		        System.out.print(printChar(board[0][1]));
		        System.out.print("|");
		        System.out.println(printChar(board[0][2]));
		        System.out.println("-----");
		        System.out.print(printChar(board[1][0]));
		        System.out.print("|");
		        System.out.print(printChar(board[1][1]));
		        System.out.print("|");
		        System.out.println(printChar(board[1][2]));
		        System.out.println("-----");
		        System.out.print(printChar(board[2][0]));
		        System.out.print("|");
		        System.out.print(printChar(board[2][1]));
		        System.out.print("|");
		        System.out.println(printChar(board[2][2]));
		        }
		   
		   
		    public static char printChar(int b) {
		       
		        switch(b) {
		        case EMPTY:
		            return ' ';
		        case USER:
		            return 'X';
		        case COMPUTER:
		            return 'O';
		        }
		        return ' ';
		    }   
		    
		   
		    public static int checkWinner(int[][] board) {
		       
		        if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
		            return board[0][0];

		        if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
		            return board[1][0];

		        if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
		            return board[2][0];


		        if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
		            return board[0][0];

		        if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
		            return board[0][1];

		        if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
		            return board[0][2];

		       
		        if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
		            return board[0][0];

		        if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
		            return board[0][2];

		        

		        return stalement;
		        }

		        public static int computer_move(int[][] board) {
		        int move = (int)(Math.random()*9);

		        while(board[move/3][move%3] != EMPTY)
		            move = (int)(Math.random()*9);

		        return move;
		        }
//***********************************************************************************
//***********************************************************************************
		        
//***********************************************************************************
		        				//ALGORITH PROGRAMS
//***********************************************************************************		        
//***********************************ANAGRAM***********************************************		
		        
		   
			public static void anagram(String s1, String s2) {
					// TODO Auto-generated method stub
					int s1_len = s1.length();
					int s2_len = s2.length();
					int flag=0;
					if (s1_len != s2_len)
					{
						System.out.println("not same lengths");
					}
					else
					{
						char[]s1_char=s1.toCharArray();
						char[]s2_char=s2.toCharArray();
						//System.out.println(s1_char);
						Arrays.sort(s1_char);
						Arrays.sort(s2_char);
						
						for (int i = 0; i < s1_len; i++) 
						{
				            if (s1_char[i] != s2_char[i]) 
				            
				            {
				            	flag=0;
				            	//System.out.println("not anagram");
				            }
				            else
				            {	flag=1;
				            	//System.out.println("anagram");
				            }
					}
						if(flag==1)
							System.out.println("anagram");
						else
							System.out.println("not anagram");
						}
				}
//*************************************************************************
			public static int[] countAlfa(String s)
			{
				int count[]=new int[36];
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					if(ch>='A' && ch<='Z')
						count[ch-65]++;
					if(ch>='a' && ch<='z')
						count[ch-97]++;
					if(ch>='0' && ch<='9')
						count[ch-22]++;
				}
				return count;
			}
//***************************PRIME*********************************
			
			public static void prime(int n1, int n2) 
			{
				// TODO Auto-generated method stub
				int flag=0;
				String prime = "";
				char demo[]=new char[1000];
				for (int i=0;i<=10;i++)
				{
						for (int j=2;j<i;j++)
						{
							if(i%j==0)
							{
								flag=0;
								break;
							}
							else
							{
								flag=1;
								//System.out.println(i);
							}
						}
						if(flag==1)
						{							
							System.out.print(i+" is ");
							//prime=prime+i+" ";
						palindrom(i);	
						}		
				}
				//System.out.println(prime);
				//char[]prime_char=prime.toCharArray();
				int prime_l=prime.length();
			}
			
//******************************************************************
//******************************PALINDROM************************************		
			public static void palindrom(int n)
			{
				int r,sum=0,temp; 
				temp=n;    
				  while(n>0){    
				   r=n%10; 
				   sum=(sum*10)+r;    
				   n=n/10;    
				  }    
				  if(temp==sum)
					  
				   System.out.println("palindrome number ");    
				  else    
				  System.out.println("not palindrome number");  
				
				
			}
//********************************************************************

			public static int BinarySearch(int[] data, int key) {
				// TODO Auto-generated method stub
				int start=0;
				int end=data.length-1;
				
				//System.out.println(start+" "+end);
				
				while(start <= end)
				{
					int mid = (start+end)/2;
					//System.out.println(mid);
					if(data[mid]==key) {
						System.out.println(mid);
						}
					if(key<data[mid])
					{
						end=mid-1;
					}
					else
					{
					start=mid+1;
					}
					
				}
				return -1;	
			}
			
//******************************String Binary Search***********
			
			public static int StringBinarySort(String[] data_string, String key1) {
				// TODO Auto-generated method stub
				
				
			Arrays.sort(data_string);
			int start=0;
			int end=data_string.length-1;
		while(start<=end)
		{	
			int mid=(start+end)/2;
			if(key1.compareTo(data_string[mid])==0)
			{
				end=mid;
			}
			else if (key1.compareTo(data_string[mid]) > 0)
			{
				start = mid+1;
			}
			else
			{
				System.out.println(mid);
				break;
			}
			
		}
			return -(start+1);
		}








}

	
	
	
		

	
