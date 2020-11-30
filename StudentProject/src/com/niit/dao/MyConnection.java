package com.niit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.niit.model.Student;

public class MyConnection
{
	Connection con=null;
	
	public Connection getConnection()  
	{
		//H2 database
		
		try {
			Class.forName("org.h2.Driver");
			con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","sa");
			System.out.println("Connection Established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void save(Student s)
	{
		String nm=s.getName();
		String crs=s.getCourse();
		PreparedStatement pst;
		try {
			con=getConnection();
			pst = con.prepareStatement("insert into stud values(?,?)");
			pst.setString(1, nm);
			pst.setString(2,crs);
			
			int count=pst.executeUpdate();
			
			if(count==1)
			{
				System.out.println("Record Inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public ArrayList getStudents()
	{
		//retreive all students
		//data retreived is in resultset
		//convert ResultData into ArrayList
		//return arrayList
		con=getConnection();
		ArrayList<Student> list=new ArrayList<>();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from stud");
			
			while(rs.next())
			{
				String nm=rs.getString(1);
				String crs=rs.getString(2);
				
				Student s=new Student();
							
				s.setName(nm);
				s.setCourse(crs);
				
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
