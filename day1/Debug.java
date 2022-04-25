package com.org.genp.day1;
import java.util.Scanner;
public class Debug{



	public static void main(String args[]) {
		
		double number, sum =0.0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<6 ; i++) {
			System.out.println("Enter the number "+i+" ;");
			number = sc.nextDouble();
			
			
			sum +=number;
			
		}
		System.out.println("Sum = "+ + sum);
		sc.close();
}}
