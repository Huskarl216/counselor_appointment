package org.iiitb.courseproject.model;

public class StudentBookingHistory {
	private int idHistory;
	private int Student_id;
	private int Slot_id;
	

	public int getIdHistory() {
		return idHistory;
	}
	
	public void setIdHistory(int idHistory) {
		this.idHistory=idHistory;
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
