package com.saraya.service;

public class UserValidation {
	public boolean isValid(String name ,String password) {
		return name.equalsIgnoreCase("Kande") &&
				password.equals("secret");
			
		}
		
	}


