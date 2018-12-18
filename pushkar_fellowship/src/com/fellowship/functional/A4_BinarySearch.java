package com.fellowship.functional;

import java.util.Arrays;
import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A4_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int data[]= {1,6,17,22,45};		//for binary search
		int data1[]= {12,1,4,6,10,100};
		String data_string[]= {"hey","despacito","hola","pushkar","janhavi","nik"};
		//String data_string[]= {"z","x","y","a","b","c"};

		System.out.println("enter choice"
				+ "\n1.BS for int"
				+ "\n2.BS for string"
				+ "\n3.IS for int"
				+ "\n4.IS for string "
				+ "\n5.BS for int"
				+ "\n6.BS for String" );
		String ch;
		ch= sc.nextLine();
		
		switch(ch)
		{
		case "1":
			Arrays.sort(data);
			System.out.println("enter key value:");
			int key = sc.nextInt();
			utilities.BinarySearch(data, key);
			break;
			
		case "2":
			Arrays.sort(data_string);
			for(int i=0;i<=data_string.length-1;i++)
			{
				System.out.print(data_string[i]+" ");
			}
			System.out.println("\nenter key value:");
			String key1=sc.nextLine();
			utilities.StringBinarySort(data_string,key1);
			break;
			
		case "3":
			int len=data.length-1;
			utilities.insertion_sort_int(data, len);
			break;
			
		case "4":
			utilities.string_InsertionSort(data_string);
			break;
			
		case "5":
			utilities.BubbleSortInt(data1);
			break;
		case "6":
			utilities.BubbleSort_String(data_string);
			break;
			
		default:
			System.out.println("invalid");
		}
		
		
//BS I
			/*System.out.println("enter key value:");
			int data[]= {1,6,17,22,45};
			
			int key = sc.nextInt();
			utilities.BinarySearch(data, key);*/
//BS S
			/*String data_string[]= {"hey","hello","hola","pushkar","janu","nik"};
			Arrays.sort(data_string);
			for(int i=0;i<=data_string.length-1;i++)
			{
				System.out.print(data_string[i]+" ");
			}
			System.out.println("\nenter key value:");
			String key1=sc.nextLine();
			utilities.StringBinarySort(data_string,key1);*/
//IS I
			/*int insertion_data[]= {1,16,7,2,45};
			int len=insertion_data.length-1;
			utilities.insertion_sort_int(insertion_data, len);*/
			
//IS B		
			//String arr[]= {"aaa","ZZZ","ppp","djrfhgki","og"};
			
			//utilities.string_InsertionSort(arr);
		
	}

}
