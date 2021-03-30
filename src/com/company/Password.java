package com.company;

enum Password {
	INSTANCE;
	
	private String adminPassword = "qwerty";
	
	public String returnName(){
		return adminPassword;
	}
	
	
}
