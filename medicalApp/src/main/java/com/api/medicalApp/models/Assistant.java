package com.api.medicalApp.models;

public class Assistant extends User{

	private String customAssistant;
	
	public Assistant() {}
	
	public Assistant(String username, String name, String lastname, long phoneNumber) {
		super();
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.customAssistant = "Asistente lelo";
	}

	public String getCustomAssistant() {
		return customAssistant;
	}

	public void setCustomAssistant(String customAssistant) {
		this.customAssistant = customAssistant;
	}

	@Override
	public String toString() {
		return "Assistant [customAssistant=" + customAssistant + ", id=" + id
				+ ", username=" + username + ", name=" + name + ", lastname="
				+ lastname + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
