package com.student.manage;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student student) {
		
		boolean flag = false;
		try {
		
		Connection con = ConnectionClass.createConnection();
		
		String query = "INSERT INTO student(sname,sphone,city,age) VALUES(?,?,?,?)";
		
		//Prepared Statement
		PreparedStatement preparedStatement = con.prepareStatement(query);
		
		// Set values of parameters
		preparedStatement.setString(1, student.getStudentName());
		preparedStatement.setString(2, student.getStudentPhone());
		preparedStatement.setString(3, student.getStudentCity());
		preparedStatement.setInt(4, student.getStudentAge());
		
		//execute query
		preparedStatement.executeUpdate();
		flag = true;
		//
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteStudent(int id) {
		
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
		
		Connection con = ConnectionClass.createConnection();
		
		String query = "DELETE FROM student WHERE sid = ?";
		
		//Prepared Statement
		PreparedStatement preparedStatement = con.prepareStatement(query);
		
		// Set values of parameters
		preparedStatement.setInt(1, id);
	
		
		//execute query
		preparedStatement.executeUpdate();
		flag = true;
		//
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
		
		
	}
	public static void showAllStudents() {
		
		Connection con = ConnectionClass.createConnection();
		
		String query = "SELECT * FROM student";
		
		try {
			
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				int id = resultSet.getInt("sid");
				String name = resultSet.getString("sname");
				String city = resultSet.getString("city");
				int age = resultSet.getInt("age");
				String phone = resultSet.getString("sphone");
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Age : "+age);
				System.out.println("Phone: "+phone);
				System.out.println("City: "+city);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}


}
