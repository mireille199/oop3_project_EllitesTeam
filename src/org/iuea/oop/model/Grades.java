package org.iuea.oop.model;

public class Grades {
	private String courseUnit;
	private int assignt;
	private int cseWrk;
	private int prac;
	private int prestn;
	private int fnlExam;
	private int fnlMark;
	private int cseGrade;
	
	public Grades() {
		
	}
	public Grades(String courseUnit, int assignt, int cseWrk, int prac, int prestn, int fnlExam, int fnlMark, int cseGrade) {
		this.courseUnit =courseUnit;
		this.assignt =assignt;
		this.cseWrk = cseWrk;
		this.prac = prac;
		this.prestn = prestn;
		this.fnlExam = fnlExam;
		this.fnlMark = fnlMark;
		this.cseGrade = cseGrade;
	}
	public String getCourseUnit() {
		return courseUnit;
	}
	public int getAssignt() {
		return assignt;
	}
	public int getCseWrk() {
		return cseWrk;
	}
	public int getPrac() {
		return prac;
	}
	public int getPrestn() {
		return prestn;
	}
	public int getFnlExam() {
		return fnlExam;
	}
	public int getFnlMark() {
		return fnlMark;
	}
	public int getCseGrade() {
		return cseGrade;
	}
	public void setCourseUnit(String courseUnit) {
		this.courseUnit = courseUnit;
	}
	public void setAssignt(int assignt) {
		this.assignt = assignt;
	}
	public void setCseWrk(int cseWrk) {
		this.cseWrk = cseWrk;
	}
	public void setPrac(int prac) {
		this.prac = prac;
	}
	public void setPrestn(int prestn) {
		this.prestn = prestn;
	}
	public void setFnlExam(int fnlExam) {
		this.fnlExam = fnlExam;
	}
	public void setFnlMark(int fnlMark) {
		this.fnlMark = fnlMark;
	}
	public void setCseGrade(int cseGrade) {
		this.cseGrade = cseGrade;
	}
	
}

