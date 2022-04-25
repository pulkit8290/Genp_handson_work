package com.org.genp.day1;

import java.util.Scanner;

public class MenuDriven{
public static void main(String args[]){
	System.out.println("Welcome to BharityaTasteBuds.com");
	
	System.out.println("To order south Indian Dish, Enter 1"
			+ "\nTo order north Indian Dish, Enter 2"
			+ "\nTo order Rajasthani Dish, Enter 3"
			+ "\nTo order Gujarati Dish, Enter 4"
			+ "\nTo order Bengali Dish, Enter 5"
			+ "\nTo order Deserts, Enter 6"
			+ "\nTo Exit, Enter 9");
	Scanner sc = new Scanner(System.in);
    
	System.out.print("Enter your choice = ");
	int choice = sc.nextInt();

 
switch(choice){
case 1 :
	System.out.println("Welcome to South Indian food court:");
	System.out.println("You get:"
			+ "\nDosa : 2 pieces"
			+ "\nVada : 2 pieces"
			+ "\nidli sambhar : 1 plate");
      break;
case 2:
	System.out.println("Welcome to North Indian food court:");
	System.out.println("You get:"
			+ "\nMalai ki Kheer : 1 bowl"
			+ "\nChicken Dum Biryani : 2 Plates"
			+ "\nDahi Bhalla : 1 Bowl");
      break;
case 3:
	System.out.println("Welcome to Rajasthani food court:");
	System.out.println("You get:"
			+ "\nGhewar : 1kg"
			+ "\nOnion kachori : 2 pieces"
			+ "\nDaal Baati : 1 plate");
      break;
case 4:
	System.out.println("Welcome to Gujarati food court:");
	System.out.println("You get:"
			+ "\nDal Dhokli : 1 plate"
			+ "\nDhokhla : 1 plate"
			+ "\nMethi ka Thepla : 1 plate");
      break;
case 5:
	System.out.println("Welcome to Bengali food court:");
	System.out.println("You get:"
			+ "\nDoi Maach : 1 plate"
			+ "\nChingri Malai Curry : 1 plate"
			+ "\nPatishapta : 1 plate");
      break;
case 6:
	System.out.println("Welcome to Deserts:");
	System.out.println("You get:"
			+ "\nGajar Ka Halwa : 100gm"
			+ "\nGulaabh jamun : 2 piece"
			+ "\nKaju ki Barfi : 2 piece");
      break;

case 9:
      break;

default:
     System.out.println("Out of Menu");
}
}
}