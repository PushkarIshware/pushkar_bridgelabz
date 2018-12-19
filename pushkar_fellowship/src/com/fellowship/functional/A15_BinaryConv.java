package com.fellowship.functional;

import java.math.BigInteger;
import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class A15_BinaryConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        int n = sc.nextInt();
        if(n>256)
        {
        	System.out.println("out of range");
        }
        else {
		utilities.ToBinary(n);
        }
	}
}
