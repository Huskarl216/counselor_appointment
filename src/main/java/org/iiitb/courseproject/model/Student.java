package org.iiitb.courseproject.model;

public class Student{
	private int idStudent;
	private String Studentemail;
	private String name;
	
	public Student() {
		
	}
	
	public int getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(int idStudent) {
		this.idStudent=idStudent;
	}

	public String getStudentEmail() {
		return Studentemail;
	}

	public void getStudentEmail(String Studentemail) {
		this.Studentemail=Studentemail;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
}