package com.api.medicalApp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.medicalApp.controllers.AssistantController;
import com.api.medicalApp.controllers.ControllerFactory;
import com.api.medicalApp.controllers.ControllerType;
import com.api.medicalApp.models.Assistant;
import com.api.medicalApp.models.User;

@Path("/assistant")
public class AssistantService {
	private static final AssistantController assistantController = (AssistantController)ControllerFactory.buildController(ControllerType.ASSISTANT);
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Assistant> getAssistants(){
		List<Assistant> assistants = new ArrayList<>();
		List<User> users = assistantController.getUsers();
		for(User user : users){
			assistants.add((Assistant) user);
		}
		return assistants;
	}
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Assistant getAssistant(@PathParam("param") long id){
		return (Assistant) assistantController.getUser(id);
	}
}
