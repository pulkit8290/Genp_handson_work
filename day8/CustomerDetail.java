package com.org.genp.day8;
import java.util.Scanner;

class Customer {

	String name;
	long AccNo;
	int AccBal;
	int bal;
	int wbal;
	
	public void Deposit(int bal,int AccBal) {
		
		AccBal= AccBal+ bal;
		System.out.println("Your account Balance after deposit is: "+AccBal);
		
	}
	
	public void Withdrawn(int wbal, int AccBal) {
		if (AccBal>2000){
			AccBal= AccBal - wbal;
			System.out.println("Your account Balance after withdrawn is: "+AccBal);
		}
		else{
			System.out.println(" Insufficient balance for withdrawn! ");
			System.out.println("Your account Balance is: "+AccBal);
		}
	}
    public void Check(int AccBal, long AccNo, String name) {
    	
    	if (AccBal > 20000) {
    		System.out.println(" PREMIUM CUSTOMER! "+" Customer name: "+name+" Acc Number: "+AccNo+" Acc Balance: "+AccBal);
    	}
    	
    	else if(AccBal < 2000){
    		System.out.println(" Poor CUSTOMER! "+" Customer name: "+name+" Acc Number: "+AccNo+" Acc Balance: "+AccBal);
    		
    	}
    	
		
	}}

public class CustomerDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your role: 1.Admin   2.Customer");
        int n = sc.nextInt();
        
  
        
        Customer emp = new Customer();
        switch(n) {
        case 1:
        	
        	System.out.print("WELCOME ADMIN! \n\n");
        	System.out.print("Enter Customer name: ");
            String n1 = sc.next();
            System.out.print("Enter Customer ACC number: ");
            Long n2 = sc.nextLong();
            System.out.print("Enter Customer ACC balance: ");
            int n3 = sc.nextInt();
        	emp.Check(n3,n2,n1);
        	break;
        case 2:
        	System.out.print("WELCOME Customer! \n\n");
        	System.out.print("Enter Customer name: ");
            String n4 = sc.next();
            System.out.print("Enter Customer ACC number: ");
            Long n5 = sc.nextLong();
            System.out.print("Enter Customer ACC balance: ");
            int n6 = sc.nextInt();
            
            System.out.print("Enter your choice: 1.Deposit   2.Withdrawn");
            int choice = sc.nextInt();
            switch(choice) {
            
            case 1:
            	System.out.print("Enter money for deposit: ");
            	int money = sc.nextInt();
            	emp.Deposit(money,n6);
            	break;
            case 2:
            	System.out.print("Enter money to withdrawn: ");
            	int money1 = sc.nextInt();
            	emp.Withdrawn(money1,n6);
            	break;
            }}}}