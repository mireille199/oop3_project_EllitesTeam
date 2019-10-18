package org.iuea.oop.model;

public class Courses {
	private String courseName;
	private String courseCode;
	private String courseDescrptn;
	
	public Courses() {
		
	}
	public Courses(String courseName, String courseCode, String courseDescrptn ){
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseDescrptn = courseDescrptn;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public String getCourseDescrptn() {
		return courseDescrptn;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public void setCourseDescrptn(String courseDescrptn) {
		this.courseDescrptn = courseDescrptn;
	}
	
}



