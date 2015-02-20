package com.api.medicalApp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.api.medicalApp.models.Pacient;
import com.api.medicalApp.models.User;

public class PacientController extends Controller {

	public PacientController() {
		super(ControllerType.PACIENT);
	}

	@Override
	public User getUser(long id) {
		Pacient pacient = new Pacient("username", "pacient", "navarro", 72050083);
		pacient.setId(id);
		return pacient;
	}

	@Override
	public List<User> getUsers() {
		Pacient pacient = new Pacient("username", "pacient list", "navarro", 72050083);
		List<User> pacients = new ArrayList<>();
		pacients.add(pacient);
		return pacients;
	}

}
