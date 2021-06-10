package com.bridgelab.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class UserRegistation {
	// Valiadate First Name
	public boolean validateFirstName(String str) {
		String firstName = str;
		String regex = "^[A-Z]{1}[a-z]{2,15}$";
		Pattern p = Pattern.compile(regex);
		if (firstName == null) {
			return false;
		}
		Matcher m = p.matcher(firstName);
		return m.matches();
	}

	// Validate Last Name
	public boolean validateLasttName(String str) {
		String lastName = str;
		String regex = "^[A-Z]{1}[a-z]{2,15}$";
		Pattern p = Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		Matcher m = p.matcher(lastName);
		return m.matches();
	}

	// Validate Email Address
	public boolean validateEmail(String str) {
		String emailAdd = str;
		String regex = "^[A-Za-z+.]+@[a-zA-Z.]+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(regex);
		if (emailAdd == null) {
			return false;
		}
		Matcher m = p.matcher(emailAdd);
		return m.matches();
	}

	// Validate Phone Number Giving Space
	public boolean phoneNumber(String str) {
		String phoneNumber = str;
		String regex = "(91)[: :][9][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		if (phoneNumber == null) {
			return false;
		}
		Matcher m = p.matcher(phoneNumber);
		return m.matches();
	}

	// Passwword Validation
	public boolean passwordValidation(String str) {
		String password = str;
		String regex = "^(?=.*[A-Z])[a-zA-Z]{8,}$";
		Pattern p = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}
}
