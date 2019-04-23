package org.iiitb.courseproject.model;

public class Date{
	private int idDate;
	private String DateValue;
	private int Counselor_id;
	
	public Date() {
		
	}
	
	public int getIdDate() {
		return idDate;
	}
	
	public void setIdDate(int idDate) {
		this.idDate=idDate;
	}

	public String getDateValue() {
		return DateValue;
	}

	public void setDateValue(String DateValue) {
		this.DateValue=DateValue;
	}
	
	public int getCounselor_Id() {
		return Counselor_id;
	}
	
	public void setCounselor_Id(int Counselor_id) {
		this.Counselor_id=Counselor_id;
	}

	
}