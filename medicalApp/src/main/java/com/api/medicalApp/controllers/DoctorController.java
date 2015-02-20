package com.api.medicalApp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.api.medicalApp.models.Doctor;
import com.api.medicalApp.models.User;

public class DoctorController extends Controller{

	public DoctorController() {
		super(ControllerType.DOCTOR);
	}

	@Override
	public User getUser(long id) {
		Doctor doctor = new Doctor("username", "assistant", "navarro", 72050083);
		doctor.setId(id);
		return doctor;
	}

	@Override
	public List<User> getUsers() {
		Doctor doctor = new Doctor("username", "assistant list", "navarro", 72050083);
		List<User> doctors = new ArrayList<>();
		doctors.add(doctor);
		return doctors;
	}

}
