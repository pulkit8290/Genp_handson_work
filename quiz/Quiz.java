package com.org.genp.day12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String Name = null;
			String Answer1;
			String Answer2 ;
			String Answer3;
			String Answer4;
			String Answer5 ;
			int Total_Marks=0;
			int testId=17;
			
			Scanner sc = new Scanner(System.in);
			
			if (sc != null) {
				System.out.println("This test contains 5 questions. Each right answer fetch you 5 marks. ");
				System.out.println("Enter your Roll No:");
				testId=sc.nextInt();
				System.out.println("Enter your Name:");
				Name = sc.next();
				System.out.println("What is the capital of india ? ");
				Answer1 = sc.next();
				if(Answer1.equalsIgnoreCase("DELHI")) {
					Total_Marks+=5;
				}
				else {
					Total_Marks+=0;
				}
				System.out.println("What is the capital of America ? ");
				Answer2 = sc.next();
				if(Answer2.equalsIgnoreCase("WASHINGTON")) {
					Total_Marks+=5;
				}
				else {
					Total_Marks+=0;
				}
				System.out.println("What is the capital of England ? ");
				Answer3 = sc.next();
				if(Answer3.equalsIgnoreCase("LONDON")) {
					Total_Marks+=5;
				}
				else {
					Total_Marks+=0;
				}
				System.out.println("What is the capital of Pakistan ? ");
				Answer4 = sc.next();
				if(Answer4.equalsIgnoreCase("ISLAMABAD")) {
					Total_Marks+=5;
				}
				else {
					Total_Marks+=0;
				}
				System.out.println("What is the capital of Japan ? ");
				Answer5 = sc.next();
				if(Answer5.equalsIgnoreCase("BEIJING")) {
					Total_Marks+=5;
				}
				else {
					Total_Marks+=0;
				}
				
				
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loading...");
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/genp2","root","Rajyeshree891");
				
				System.out.println("Connection established....");
				
				Statement st = con.createStatement();
				
				String insertQuery = "insert into QUIZ values('"+testId+"','"+Name+"','"+Answer1+"','"+Answer2+"','"+Answer3+"','"+Answer4+"','"+Answer5+"','"+Total_Marks+"')";
				
				int result = st.executeUpdate(insertQuery);
				
				if (result ==0) {
					System.out.println("Record insert failed");
				}
				else {
					System.out.println(result + "Record(s) Insrted");
				}
				st.close();
				con.close();
			}
			
			System.out.println();
			System.out.println("Marks obtained is : " + Total_Marks);
			
			
			
		}

		catch(Exception e) {
			System.out.println(e);
		}
	}

}