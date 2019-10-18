package org.iuea.oop.model;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private String courseName;
	private int year;
	
	public Student() {
		
	}
	public Student(String firstName, String lastName, String email, String courseName, int year ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.courseName = courseName; 
		this.year = year;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getYear() {
		return year;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setYear(int year) {
		this.year = year;
	}
}