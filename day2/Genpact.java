package com.org.genp.day2;
import java.util.Scanner;
import java.lang.Math;


class EmployeeDetails 
{
    int id;
    String name;
    int Experience; 
    String Skills; 
    float salary;
}
public class Genpact{
            public static void main(String args[]) 
   {
            Scanner sc = new Scanner(System.in);
            System.out.print("How many employees? ");
            int n = sc.nextInt();
            EmployeeDetails emp[] = new EmployeeDetails[n];
            for (int i = 0; i < n; i++) {
	            emp[i] = new EmployeeDetails();
	            System.out.println("Enter " + (i + 1) + " Employee data :");
	            System.out.print("Enter employee id :");
	            emp[i].id = sc.nextInt();
	            System.out.print("Enter employee name :");
	            emp[i].name = sc.next();
	            System.out.print("Enter employee Skills :");
	            emp[i].Skills = sc.next();
	            System.out.print("Enter employee Experience :");
	            emp[i].Experience = sc.nextInt();
	            System.out.print("Enter employee salary :");
	            emp[i].salary = sc.nextFloat();
	            
            }
            System.out.println("\n\n------------ All Employee Details are :------------\n");

            
            for (int i = 0; i < n; i++) {
            	System.out.println("Employee id: "+ emp[0].id+", Name "+ emp[i].name +", Skills " 
                    	+ emp[i].Skills + ", Experience " + emp[i].Experience + "yrs and Salary: " +
                    +emp[i].salary);
             }
            
            
            
            
           //Max salary
            float max = emp[0].salary;
            for(int i = 0; i < n; i++)
            {
            if(max < emp[i].salary)
            {
            max = emp[i].salary;
            }
            }
            System.out.println("\n\nMaximum salary among all is:"+max);  	  
            
            //SkillSet
            System.out.println("\n\nDetails of those employees whose Skillset is java are: \n");
            
            for(int i = 0; i < n; i++)
            {
            if(emp[i].Skills.equals("Java"))
            {
            	System.out.println("Employee id: "+ emp[0].id+", Name "+ emp[i].name +", Skills " 
                    	+ emp[i].Skills + ", Experience " + emp[i].Experience + "yrs and Salary: " +
                    +emp[i].salary);
            }
            }
          //Hike
            System.out.println("\n\nIf EMP Exp > 5yrs and skillset = java, after 20% hike to salary are: \n");
            
            for(int i = 0; i < n; i++)
            {
            if(emp[i].Experience>5  &&  emp[i].Skills.equals("Java"))
            {
            	
            	emp[i].salary = emp[i].salary+ (20*(emp[i].salary))/100;
            	
            	System.out.println("Employee id: "+ emp[0].id+", Name "+ emp[i].name +", Skills " 
                    	+ emp[i].Skills + ", Experience " + emp[i].Experience + "yrs and Salary: " +
                    +emp[i].salary);
            }
            }
            
          //to change skillset
            System.out.println("\n\nIf EMP exp > 10 years then Employee can change skillset: \n");
            for(int i = 0; i < n; i++)
            {
            if(emp[i].Experience>10)
            {
            	
            	System.out.println(emp[i].name+ " Change your skill set: \n");
            	emp[i].Skills = sc.next();
            	
            	System.out.println("Employee id: "+ emp[0].id+", Name "+ emp[i].name +", Skills " 
                    	+ emp[i].Skills + ", Experience " + emp[i].Experience + "yrs and Salary: " +
                    +emp[i].salary);
            }
            }

 }
}