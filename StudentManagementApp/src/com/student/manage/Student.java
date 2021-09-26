package com.student.manage;

public class Student {
	
	private int studentID;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	private int studentAge;
	public Student(int studentID, String studentName, String studentPhone, String studentCity, int studentAge) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentAge = studentAge;
	}
	public Student(String studentName, String studentPhone, String studentCity, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentAge = studentAge;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + ", studentAge=" + studentAge + "]";
	}
	
	
}
