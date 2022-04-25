package com.org.genp.day1;

import java.util.Scanner;

public class PascalTriangle {
	 public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int m, n;
		System.out.print("Enter Pascals Triangle Pattern Rows = ");
		int rows = sc.nextInt();
		System.out.println("Printing Complete Pascals Triangle Star Pattern");
      
        for (m = 1; m <= rows; m++) {
            for (n = 1; n <= rows - m; n++) {
                System.out.print(" ");
            }
      
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
          
            System.out.println();
        }
 
        for (m = rows - 1; m > 0; m--) {
           
            for (n = 1; n <= rows - m; n++) {
                System.out.print(" ");
            }
       
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}