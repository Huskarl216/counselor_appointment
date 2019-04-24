package org.iiitb.courseproject.model;

public class Student_Slot_Request {
	private int idRequest;
	private int Student_id;
	private int Slot_id;
	

	public Student_Slot_Request(int Student_id,int Slot_id) {
		this.Student_id=Student_id;
		this.Slot_id=Slot_id;
	}
	
	public int getIdRequest() {
		return idRequest;
	}
	
	public void setIdRequest(int idRequest) {
		this.idRequest=idRequest;
	}
	
	public int getStudent_Id() {
		return Student_id;
	}
	
	public void setStudent_Id(int Student_id) {
		this.Student_id=Student_id;
	}
	
	public int getSlot_Id() {
		return Slot_id;
	}
	
	public void setSlot_Id(int Slot_id) {
		this.Slot_id=Slot_id;
	}

}