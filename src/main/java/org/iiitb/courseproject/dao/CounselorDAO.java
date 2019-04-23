package org.iiitb.courseproject.dao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.iiitb.courseproject.model.Counselor;

public class CounselorDAO extends HibernateDAO<Counselor> {
	String entity="Counselor";
	
	public List<Counselor> getAllNames(){
		return super.list(new Counselor());
	}
}