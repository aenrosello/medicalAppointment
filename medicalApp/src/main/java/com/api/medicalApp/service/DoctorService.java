package com.api.medicalApp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.medicalApp.controllers.DoctorController;
import com.api.medicalApp.controllers.ControllerFactory;
import com.api.medicalApp.controllers.ControllerType;
import com.api.medicalApp.models.Doctor;
import com.api.medicalApp.models.User;

@Path("/doctor")
public class DoctorService {
	private static final DoctorController doctorController = (DoctorController)ControllerFactory.buildController(ControllerType.DOCTOR);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Doctor> getDoctor(){
		List<Doctor> doctors = new ArrayList<>();
		List<User> users = doctorController.getUsers();
		for(User user : users){
			doctors.add((Doctor) user);
		}
		return doctors;
	}
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Doctor getDoctor(@PathParam("param") long id){
		return (Doctor) doctorController.getUser(id);
	}
}
