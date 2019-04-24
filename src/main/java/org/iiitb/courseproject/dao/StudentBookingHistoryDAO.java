package org.iiitb.courseproject.dao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.iiitb.courseproject.model.*;

public class StudentBookingHistoryDAO extends HibernateDAO<StudentBookingHistory> {
	String entity="Student_Slot_Request";

	public int addBooking(StudentBookingHistory S) {
		try {
			int history_id = super.add(S);
			return history_id;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}
	
	public List<StudentBookingHistory> getBookingsByStudentId(int id){
		return super.findAll(entity, "Student_id", id);
	}

	
}