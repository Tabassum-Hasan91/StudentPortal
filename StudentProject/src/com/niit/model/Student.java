package com.niit.model;

public class Student 
{
	String name;
	String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String toString()
	{
		return "Name is "+name;
	}
	
}
