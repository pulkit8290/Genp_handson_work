package com.org.genp.day7;
import java.util.Scanner;
public class PasswordValidation {
	
	static boolean validateNumber(String password)
	{
	 
		if (password.length() >= 8) {
	  
	        if (true) {
	            int count = 0;
	  
	            
	            for (int i = 0; i <= 9; i++) {
	  
	                
	                String str1 = Integer.toString(i);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        }
	  
	        
	        if (!(password.contains("@") || password.contains("#")
	              || password.contains("!") || password.contains("~")
	              || password.contains("$") || password.contains("%")
	              || password.contains("^") || password.contains("&")
	              || password.contains("*") || password.contains("(")
	              || password.contains(")") || password.contains("-")
	              || password.contains("+") || password.contains("/")
	              || password.contains(":") || password.contains(".")
	              || password.contains(", ") || password.contains("<")
	              || password.contains(">") || password.contains("?")
	              || password.contains("|"))) {
	            return false;
	        }
	  
	        if (true) {
	            int count = 0;
	  
	            
	            for (int i = 65; i <= 90; i++) {
	  
	                
	                char c = (char)i;
	  
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        }
	  
	        if (true) {
	            int count = 0;
	  
	            
	            for (int i = 90; i <= 122; i++) {
	  
	                
	                char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        }}
	  
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Password: ");
		Scanner sc = new Scanner(System.in);
		 String password = sc.nextLine();
		 
		    if (validateNumber(password))
		        System.out.println("Password is Valid");
		    else
		        System.out.println("Password is Invalid");

	}

	}