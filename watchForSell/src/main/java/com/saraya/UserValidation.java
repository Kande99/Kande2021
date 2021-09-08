package com.saraya;

public class UserValidation {
	public boolean isValid(String name ,String password) {
		if(name.equalsIgnoreCase("Kande") &&
				password.equals("secret")) {
			return true;
		}
		return false;
	}

}
