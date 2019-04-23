package org.iiitb.courseproject.model;

public class Counselor {
	private int idCounselor;
	private String Counseloremail;
	private String name;
	
	public Counselor() {
		
	}
	
	public int getIdCounselor() {
		return idCounselor;
	}
	
	public void setIdCounselor(int idCounselor) {
		this.idCounselor=idCounselor;
	}

	public String getCounselorEmail() {
		return Counseloremail;
	}

	public void getCounselorEmail(String Counseloremail) {
		this.Counseloremail=Counseloremail;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

}