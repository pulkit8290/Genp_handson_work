package com.org.genp.day2;


class Bank {

	private String name;
	private long AccNo;

	Bank(String name, long AccNo)
	{
		
		this.name = name;
		this.AccNo = AccNo;
	}


	public String getBankDetails()
	{
		return (this.name +"Bank and Account number is "+ this.AccNo);
		
	}
}

class Employee {
	
	private String name;
	Employee(String name)
	{
		this.name = name;
	}

	public String getEmployeeName()
	{
		return this.name;
	}
}

class BankAccount{

	public static void main(String[] args)
	{

		Bank bank1 = new Bank("SBI ", 217511233);
		Bank bank2 = new Bank("AXIS ", 765413445);
		Employee emp = new Employee("Pulkit");

		System.out.println(emp.getEmployeeName()
						+ " has account in "
						+ bank1.getBankDetails());
		System.out.println(emp.getEmployeeName()
				+ " has account in "
				+ bank2.getBankDetails());
	}
}
