package com.api.medicalApp.models;

public class Pacient extends User {
	private String customPacient;
	public Pacient() {}
	
	public Pacient(String username, String name, String lastname, long phoneNumber) {
		super();
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.customPacient = "paciente molesto";
	}

	public String getCustomPacient() {
		return customPacient;
	}

	public void setCustomPacient(String customPacient) {
		this.customPacient = customPacient;
	}

	@Override
	public String toString() {
		return "Pacient [customPacient=" + customPacient + ", id=" + id
				+ ", username=" + username + ", name=" + name + ", lastname="
				+ lastname + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
