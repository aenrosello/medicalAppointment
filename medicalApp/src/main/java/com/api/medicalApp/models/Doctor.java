package com.api.medicalApp.models;

public class Doctor extends User {
	private String custom;
	
	public Doctor(){
		super();
	}
	
	public Doctor(String username, String name, String lastname, long phoneNumber) {
		super();
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.custom = "doctor chapatin";
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	@Override
	public String toString() {
		return "Doctor [custom=" + custom + ", id=" + id + ", username="
				+ username + ", name=" + name + ", lastname=" + lastname
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
