package com.org.genp.day13;


import java.sql.*;
public class Query1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loading....");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/genp3","root","R");
			System.out.println("Connection establishing");
			Statement st = con.createStatement();
			//query1
			ResultSet rs = st.executeQuery("select * from emp_info INNER JOIN  dept ON emp_info.empid = dept.empid WHERE dname = 'QA'");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+ rs.getString(5));
			
				
				
			}
			
			st.close();
			con.close();
		}catch(Exception e) {
			
		}
	}

}