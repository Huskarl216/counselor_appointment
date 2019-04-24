package org.iiitb.courseproject.services;

import java.util.ArrayList;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.iiitb.courseproject.model.*;
import org.iiitb.courseproject.dao.*;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

@SuppressWarnings("unused")
@Path("/Student_Slot_Request")
public class Student_Slot_RequestServices{
	@POST
	@Path("/getRequestsBySlotId/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public List<Student_Slot_Request> getRequestsBySlotId(@PathParam("id") int slot_id){
		Student_Slot_RequestDAO ssrdao = new Student_Slot_RequestDAO();
		List<Student_Slot_Request> requests = ssrdao.getRequestsBySlotId(slot_id);
		if(requests==null)
			return null;
		else
			return requests;
		
	}
}