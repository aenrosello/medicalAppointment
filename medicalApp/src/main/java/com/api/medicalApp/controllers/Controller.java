package com.api.medicalApp.controllers;

import java.util.List;

import com.api.medicalApp.models.User;

public abstract class Controller {
	private ControllerType controllerType;
	public Controller(ControllerType controllerType) {
		this.setControllerType(controllerType);
	}

	public abstract User getUser(long id);
	public abstract List<User> getUsers();

	public ControllerType getControllerType() {
		return controllerType;
	}

	public void setControllerType(ControllerType controllerType) {
		this.controllerType = controllerType;
	}
}
