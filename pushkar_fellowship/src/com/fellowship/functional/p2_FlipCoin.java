package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class p2_FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter no of times to flip coin:");
        int flip = sc.nextInt();
        utilities.flip_count(flip);
	}

}
