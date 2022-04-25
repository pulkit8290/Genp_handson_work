package com.org.genp.day7;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Contact implements Comparable<Contact>{
	  private String firstName;
	  private long  phoneNumber;
	  private String emailId;
	  private String add;
	  Contact(String firstName, long phoneNumber, String  emailID, String add ){
		  this.firstName = firstName;
		  this.phoneNumber = phoneNumber;
		  this.emailId = emailId;
		  this.add = add;
	  }
	  
	  
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  
	  public long getPhoneNumber() {
	    return phoneNumber;
	  }
	  public void setPhoneNumber(long phoneNumber) {
	    this.phoneNumber = phoneNumber;
	  }
	  public String getEmailId() {
	    return emailId;
	  }
	  public void setEmailId(String emailId) {
	    this.emailId = emailId;
	  }
	  
	  public String getAddress() {
		    return add;
		  }
		  public void setAddress(String address) {
			  this.add = add;
		  }
	  public Contact(String firstName, String lastName, long phoneNumber,
	      String emailId,String add) {
	    super();
	    this.firstName = firstName;
	    this.phoneNumber = phoneNumber;
	    this.emailId = emailId;
	    this.add = add;
	  }
	  
	  
		  public int compareTo(Contact ct) {
			  
			 
			  return (int) (this.phoneNumber-ct.phoneNumber);
		  }
		  
	}



class EmployeeClass{

	public static void main(String[] args)
	{   
		
		ArrayList<Contact> list1 = new ArrayList<Contact>();
		
		System.out.println("Enter number of Employees: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter Employees Details:- ");
		for(int i=0;i<num;i++) {
		
			System.out.println("Enter your name : ");
			//Scanner sc1 = new Scanner(System.in);
			String firstname = sc.next();
						
			System.out.println("Enter your mobile num :");
			//Scanner sc3 = new Scanner(System.in);
			long phoneNumber = sc.nextLong();
					
						
			System.out.println("Enter your email id :");
			//Scanner sc4 = new Scanner(System.in);
			String emailId = sc.next();
			
			System.out.println("Enter your Address :");
			//Scanner sc5 = new Scanner(System.in);
			String add = sc.next();
			list1.add(new Contact(firstname,phoneNumber,emailId, add));
			
		
		}
		
         Collections.sort(list1);
         
         for (Contact ct: list1) {
        	 System.out.println(ct.getFirstName() + " - " +ct.getPhoneNumber());
         }
		    
}
	}
