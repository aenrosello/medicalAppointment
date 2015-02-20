package com.api.medicalApp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.api.medicalApp.models.Assistant;
import com.api.medicalApp.models.User;

public class AssistantController extends Controller {

	public AssistantController() {
		super(ControllerType.ASSISTANT);
	}

	@Override
	public User getUser(long id) {
		Assistant assistant = new Assistant("username", "assistant", "navarro", 72050083);
		assistant.setId(id);
		return assistant;
	}

	@Override
	public List<User> getUsers() {
		Assistant assistant = new Assistant("username", "assistant list", "navarro", 72050083);
		List<User> assistants = new ArrayList<>();
		assistants.add(assistant);
		return assistants;
	}

}
