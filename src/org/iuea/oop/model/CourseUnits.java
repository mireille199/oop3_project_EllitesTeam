package org.iuea.oop.model;

public class CourseUnits {
	private String cseUnitName;
	private String cseCrdtUnit;
	private String cseUnitDecrptn;
	private String cseUnitContnt;
	private String cseUnitCode;
	
	public CourseUnits() {
		
	}
	public CourseUnits(String cseUnitName, String cseCrdtUnit,String cseUnitDecrptn,String cseUnitContnt,String cseUnitCode) {
		this.cseUnitName = cseUnitName;
		this.cseCrdtUnit = cseCrdtUnit;
		this.cseUnitDecrptn = cseUnitDecrptn;
		this.cseUnitContnt = cseUnitContnt;
		this.cseUnitCode = cseUnitCode;
	}
	public String getCseUnitName() {
		return cseUnitName;
	}
	public String getCseCrdtUnit() {
		return cseCrdtUnit;
	}
	public String getCseUnitDecrptn() {
		return cseUnitDecrptn;
	}
	public String getCseUnitContnt() {
		return cseUnitContnt;
	}
	public String getCseUnitCode() {
		return cseUnitCode;
	}
	public void setCseUnitName(String cseUnitName) {
		this.cseUnitName = cseUnitName;
	}
	public void setCseCrdtUnit(String cseCrdtUnit) {
		this.cseCrdtUnit = cseCrdtUnit;
	}
	public void setCseUnitDecrptn(String cseUnitDecrptn) {
		this.cseUnitDecrptn = cseUnitDecrptn;
	}
	public void setCseUnitContnt(String cseUnitContnt) {
		this.cseUnitContnt = cseUnitContnt;
	}
	public void setCseUnitCode(String cseUnitCode) {
		this.cseUnitCode = cseUnitCode;
	}

}
