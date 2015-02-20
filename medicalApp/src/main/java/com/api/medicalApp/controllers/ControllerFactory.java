package com.api.medicalApp.controllers;

public class ControllerFactory {
	public static Controller buildController(ControllerType type) {
		Controller controller = null;
		switch (type) {
		case DOCTOR:
			controller = new DoctorController();
			break;
		case ASSISTANT:
			controller = new AssistantController();
			break;
		case PACIENT:
			controller = new PacientController();
			break;
		}
		return controller;
	}
}
