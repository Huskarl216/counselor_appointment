package org.iiitb.courseproject.model;

public class Slot{
	private int idSlot;
	private String SlotValue;
	private int Date_id;
	private boolean Status;
	
	public Slot() {
		
	}
	
	public int getIdSlot() {
		return idSlot;
	}
	
	public void setIdSlot(int idSlot) {
		this.idSlot=idSlot;
	}

	public String getSlotValue() {
		return SlotValue;
	}

	public void setSlotValue(String SlotValue) {
		this.SlotValue=SlotValue;
	}
	
	public int getDate_id() {
		return Date_id;
	}
	
	public void setDate_id(int Date_id) {
		this.Date_id=Date_id;
	}

	public boolean getStatus() {
		return Status;
	}
	
	public void setStatus(boolean Status) {
		this.Status=Status;
	}
}