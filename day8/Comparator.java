package com.org.genp.day8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Comparator {
	
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of employees");
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println("Enter the employee "+(i+1)+" Name:");
			String b = sc.next();
			System.out.println("Enter the employee "+(i+1)+" Department:");
			String c = sc.next();
			System.out.println("Enter the DateofJoining in dd/mm/yyyy format:");
			String d = sc.next();
			System.out.println("Enter the Age of employee:"+(i+1));
			int e = sc.nextInt();
			System.out.println("Enter the employee "+(i+1)+" Salary:");
			int f = sc.nextInt();
			Date date = null;
			try {
				date = new SimpleDateFormat("dd/mm/yyyy").parse(d);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			emp.add(new Employee(i,b,c,date,e,f));
		}
		
		System.out.println("Choose the Number :\n 1.Sort employees by salary "
				+ "\n 2.Sort employees by age and by date of joining \n Enter your Choice");
		
		int choice = sc.nextInt();

		 
		switch(choice){
		case 1 :
			Collections.sort(emp);
			
			Iterator<Employee> afterSort = emp.iterator();
			while(afterSort.hasNext()) {
				Employee e = afterSort.next();
				System.out.println("  Employee Id: "+e.getId()+"  Name: "+e.getName()+"  Department: "+e.getDepartment()+
						"  Date of Joining: "+e.getDateOfJoining()+"  Age: "+e.getAge()+"  Salary: "+e.getSalary());
			}
			break;
			
		case 2:
			Collections.sort(emp,new AgeComparator());
			Collections.sort(emp,new DateComparator());
			
			Iterator<Employee> ageComparator = emp.iterator();
			while(ageComparator.hasNext()) {
				Employee e = ageComparator.next();
			Iterator<Employee> dateComparator = emp.iterator();
			while(dateComparator.hasNext()) {
				Employee e1 = dateComparator.next();
				System.out.println("  Employee Id: "+e1.getId()+"  Name: "+e1.getName()+"  Department: "+e1.getDepartment()+
				"  Date of Joining: "+e1.getDateOfJoining()+"  Age: "+e1.getAge()+"  Salary: "+e1.getSalary());
			}	
			break;
		}
		}}}