package com.api.medicalApp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.medicalApp.controllers.ControllerFactory;
import com.api.medicalApp.controllers.ControllerType;
import com.api.medicalApp.controllers.PacientController;
import com.api.medicalApp.models.Pacient;
import com.api.medicalApp.models.User;

@Path("/pacient")
public class PacientService {
	private static final PacientController pacientController = (PacientController)ControllerFactory.buildController(ControllerType.PACIENT);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pacient> getPacients(){
		List<Pacient> pacients = new ArrayList<>();
		List<User> users = pacientController.getUsers();
		for(User user : users){
			pacients.add((Pacient) user);
		}
		return pacients;
	}
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pacient getPacient(@PathParam("param") long id){
		return (Pacient) pacientController.getUser(id);
	}
}
