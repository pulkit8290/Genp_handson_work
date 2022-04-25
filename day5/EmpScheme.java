package com.org.genp.day5;

import java.util.Scanner;

class SalaryException extends Exception {
	public SalaryException(int salary) {
		final int standard_salary = 70000; 
		if(salary >= standard_salary) {
			System.out.println("You are eligible for the Group leave encashment scheme");
			int installment = (int) (0.15*salary);
			System.out.println("One year installment is :"+installment);
		
		}
		else {
			System.out.println("You are not eligible for the Group leave encashment scheme");
			
			
		}
	}
}

class EmployeeGenpact{
	String name;
	int salary;
	
	public EmployeeGenpact(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void salaryvalidate(int salary) throws SalaryException
	{
			if(salary > 70000)
			{
				System.out.println("The salary is above 70,000/-");
				throw new SalaryException(salary);
			}
			else {
				System.out.println("The salary is below 70,000/-");
				throw new SalaryException(salary);
			}
	}
}

public class EmpScheme {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
		try {
			
		System.out.println("Enter you name : ");
		String name = sc.next();
		System.out.println("Enter your salary :");
		int salary = sc.nextInt();
		EmployeeGenpact e1 = new EmployeeGenpact(name,salary);
		
		
		
			e1.salaryvalidate(salary);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	}
	
}