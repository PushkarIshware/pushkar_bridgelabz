package com.fellowship.utilities;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
 import java.util.Set;
import java.util.Timer;

import javax.sound.midi.Soundbank;
import javax.swing.text.Utilities;

import com.fellowship.functional.*;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
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
//************************BINARY SEARCH FOR INT*************************
			public static void BinarySearch(int[] data, int key) {
				// TODO Auto-generated method stub
				Arrays.sort(data);
				int start=0;
				int end=data.length-1;
				
				//System.out.println(start+" "+end);
				
				while(start <= end)
				{
					int mid = (start+end)/2;
					//System.out.println(mid);
					if(data[mid]==key) {
						System.out.println(mid);
						break;
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
				if(start>end)
					System.out.println("not found");
			}
//****************************************************************************			
//******************************String Binary Search***********
			
			public static void StringBinarySort(String[] data_string, String key1) {
				// TODO Auto-generated method stub
				int start=0;
				int end=data_string.length-1;
		
			while(start<=end)
		{	
			int mid=(start+end)/2;
			int z=key1.compareTo(data_string[mid]);
			if(z==0)
			{
				System.out.println("found at "+mid);
				break;
			}
			else if (z < 0)
			{
				end=mid-1;
			}
			else
			{
				start = mid+1;
			}
			
		}
			/*if(start>end) 
				System.out.println("not found");
		*/
			}

			

//***********************************************************************
//***********************INSERTION SORT INT******************************

			public static void insertion_sort_int(int[] insertion_data, int len) {
				// TODO Auto-generated method stub
				    for(int i=1;i<=len;i++)
				    {
				    	int temp=insertion_data[i];
				    	int blank=i;
				    	while(blank >0 && insertion_data[blank-1]>temp )
				    	{
				    		insertion_data[blank] = insertion_data[blank-1];
				    		blank-=1;
				    	}
				    	insertion_data[blank]=temp;
				    }
				    
				    for(int j=0;j<=len;j++)
				    {
				    System.out.println(insertion_data[j]);
			}}
//*******************************************************************
			
			/*public static void insertion_sort_string(String[] insert_data_string){
				// TODO Auto-generated method stub
				
			    String temp="";
				for(int i=0;i<=insert_data_string.length-1;i++)
			    {
			    	for (int j=i+1;i<=insert_data_string.length-1;j++)
			    	{
			    		if(insert_data_string[i].compareToIgnoreCase(insert_data_string[j])>0)
			    		{
			    			temp=insert_data_string[i];
			    			insert_data_string[i]=insert_data_string[j];
			    			insert_data_string[j]=temp;
			    		}
			    	}
			    }
				System.out.println("sorted array:");
				for(int k=0;k<insert_data_string.length;k++)
				{
					System.out.println(insert_data_string[k]);
				}
			}*/
			public static void string_InsertionSort(String arr[]) {
				   
			    String temp="";
			    //int insertionSortStart=(int) System.nanoTime();
			    for (int i=0;i<arr.length;i++) {
			        for (int j =i+1;j<arr.length;j++) {
			            if(arr[i].compareToIgnoreCase(arr[j])>0) {
			                temp = arr[i];
			                arr[i]=arr[j];
			                arr[j]=temp;
			               
			            }
			           
			        }
			       
			    }
			    for (int e=0;e<arr.length;e++) {
			        System.out.println(arr[e]);
			       
			    }
			}
	//*********************************************************************************		

			public static void BubbleSortInt(int[] data1) {
				// TODO Auto-generated method stub
				int len = data1.length;
				System.out.println("length is: "+len);
			
				for(int i=0;i<len-1;i++)
				{
					for(int j=0;j<len-i-1;j++)
					{
						if(data1[j]>data1[j+1])
						{
							int temp=data1[j];
							data1[j]=data1[j+1];
							data1[j+1]=temp;
							
							
						}	
					}
				}
				for(int k=0;k<len;k++) {
				System.out.println(data1[k]);}
				
			}
//***********************************************************************
//****************************BUBBLE_SORT_STRING*************************

			public static void BubbleSort_String(String[] data_string) {
				// TODO Auto-generated method stub
				String temp="";
				int len=data_string.length;
				
				for(int i=0;i<len-1;i++)
				{
					for(int j=0;j<len-i-1;j++)
					{
						if(data_string[j].compareToIgnoreCase(data_string[j+1])>0)
						{
							temp=data_string[j];
							data_string[j]=data_string[j+1];
							data_string[j+1]=temp;
							
						}	
					}
				}
				for(int k=0;k<len;k++) {
				System.out.println(data_string[k]);
				}
			}
//*****************************************************************s
//****************************GUESS_NUMBER*************************

			public static int Guess_number(int lo,int hi) {
				// TODO Auto-generated method stub
				
				Scanner sc=new Scanner(System.in);
				if ((hi - lo)==1) {
				    return lo;
				}
				int mid=(hi+lo)/2;
				System.out.println("Is Your number less than "+mid+" ? \n  (1 to Yes) OR (0 to NO)");
				int a =sc.nextInt();
				if (a==1) {
				    return Guess_number(lo, mid);
				}
				else {
				    return Guess_number(mid, hi);   
				}
				
			}
//*****************************************************************
//****************************GUESS_NUMBER*************************		

			public static void BS_File_Read() throws IOException {
				// TODO Auto-generated method stub
				
				    File f =new File("/home/admin1/pushkar_projects/A5.txt");
				    String values[] = null;
				    Scanner sc =new Scanner(System.in);
				      String line = null;
				     BufferedReader br = new BufferedReader(new FileReader(f));
				     while ((line = br.readLine()) != null) {
				           values = line.split(",");
				          for (String str : values) 
				          {
				            System.out.println(str);
				          }
				        }
				        br.close();
				        System.out.println("Enter Element to search  :");
				        String key2=sc.nextLine();
				        StringBinarySort(values,key2);  
			}

			
//*****************************************************************
			//static int notes_count=0;
			static int notes[]= {1000,500,100,50,10,5,2,1};
			static int i=0;
			static int money;
			public static int total_notes=0;
			public static int vending(int[] notes, int my_money) {
				// TODO Auto-generated method stub
				int remaining;
				if (my_money==0)
				{
					//System.out.println("enter value > 0...");
					return -1;
				}
				else
				{
					if(my_money>=notes[i])
					{
						int notes_count=my_money/notes[i];
						remaining=my_money%notes[i];
						my_money=remaining;
						total_notes+=notes_count;
						System.out.println("return "+notes[i]+"Rs. x "+notes_count+" note.");
						
					}
					
					i++;
					
					return (vending(notes,my_money));
				}
				
			}
//********************************************************************************
static int usa[]= {22,12,1,6,8,0,5};
static int len=usa.length;
static int tua[];
public static int array[];
/*static int low;
static int high;*/
			public static void sort()
			{
				divide(0,len-1);
				/*array=usa;
				len=usa.length;
				tua= new int[len];
				*/
				
				for(int i=0;i<=usa.length-1;i++)
				{
					System.out.println(usa[i]+" ");
				}
			
				
			}
			public static void divide(int low,int high)
			{
				if(low<high)
				{
					int middle = low + (high-low)/2;
					
					divide(low,middle);	//left side
					divide(middle+1,high);	//right side
					
					merging(low, middle, high);
				}
				
			}
			public static void merging(int low,int middle,int high)
			{
				int tua[] = new int[len];
				for(int i=low;i<=high;i++)
				{
					tua[i]=usa[i];
				}
				
				
				int i=low;
				int j=middle+1;
				int k = low;
				while(i <= middle && j <= high)
				{
					if(tua[i] <= tua[j])
					{
						usa[k]=tua[i];
						i++;
					}
					else
					{
						usa[k]=tua[j];
						j++;
					}
					k++;
				}
				while(i<=middle)
				{
					usa[k]=tua[i];
					k++;
					i++;
				}
			}
//**************************************************		

			public static void DOW(int date,int month,int year) {
				
				/*HashMap<String, Integer> map = new HashMap<>(); 
		          
		      
		        map.put("Sunday", 0); 
		        map.put("Monday", 1); 
		        map.put("Tuesday", 2); 
		        map.put("Wednesday", 3);
		        map.put("Thusday", 4);
		        map.put("Friday", 5);
		        map.put("Saturday", 6);
		        */
				/*if(date=< 31 && date>0 && month>0 && month<=12) 
				{*/
				int year1 = year - (14 - month ) / 12;
				int x = year1 + year1 /4 - year1 /100 + year1 /400;
				int month1 = month + 12 * ((14 - month ) / 12) - 2;
				int date1 = ( date  + x + 31* month1 / 12) % 7;
				System.out.println("day is:"+date1);
				
					if(date1==0)
					{
						System.out.println("Sunday");
					}
					else if(date1==1)
					{
						System.out.println("Monday");
					}
					else if(date1==2)
					{
						System.out.println("Tuesday");
					}
					else if(date1==3)
					{
						System.out.println("Wednesday");
					}
					else if(date1==4)
					{
						System.out.println("Thusday");
					}
					else if(date1==5)
					{
						System.out.println("Friday");
					}
					else if(date1==6)
					{
						System.out.println("Saturday");
					}
					else
					{
						System.out.println("invalid");
					}
				}
			//}
//**********************************************************************************
//*****************************TEMP*************************************************
			
			/*public static char c;
			public static char f1;*/
			public static void Fahrenheit_to_Celsius(float f) {
			    // TODO Auto-generated method stub
			    float c =(float) ((f - 32) * 0.55) ;
			    System.out.println(c);
			}

			public static void Celsius_to_Fahrenheit(float c) {
			    // TODO Auto-generated method stub
			    float f =(float) ((c * (1.8)) + 32);
			    System.out.println(f);
			}
//***************************************************************************
//************************EPSILON********************************
			public static void result(int n) {
				// TODO Auto-generated method stub
				double epsilon = 1e-15;
			    double t = n;
			     while (Math.abs(t - n/t) > epsilon*t) {
			         t = (n/t + t) / 2.0;
			     }
			   
			System.out.println(t);
			}
//*******************************************************************************
//*********************MONTHLY INT***********************************************
			public static void payment(double Y, double R, double P) {
				// TODO Auto-generated method stub
				double n = 12*Y;
			    double r = R /(1200);
			    double z= Math.pow((1+r), (-n));
			    double payment = (P*r)/( 1 - z);
			    System.out.println("payment: "+payment);


			}
//*******************************************************************************
//*********************TO BINARY***********************************************
			public static void ToBinary(int n) {
				// TODO Auto-generated method stub
				String z=Integer.toString(n,2);
				while(z.length()!=8)	
				{
					z="0"+z;	
				}
				System.out.println(z);
				}
//*******************************************************************************
//********************* ***********************************************			
			
			
}
	
	
	
		

	
