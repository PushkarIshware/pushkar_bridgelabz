package com.fellowship.functional;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class program9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int a2d[][];
		a2d = new int[3][3];
        

		for (int dr=0; dr<a2d.length; dr++)
		{	
			for (int dc=0;dc<a2d.length; dc++)
			{
				System.out.println("enter values["+dr+","+dc+"]:");
				
				int p1=sc.nextInt();
				a2d[dr][dc]=p1;	
			}
		}
		
		
		utilities.int2read(a2d);
		//utilities.write_to_file(a2d);
	
		
		
	}

}
