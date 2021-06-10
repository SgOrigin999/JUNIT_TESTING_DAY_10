package com.bridgelab.junit;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class UserRegistationTest {
	UserRegistation user = new UserRegistation();
	Scanner sc = new Scanner(System.in);

	// Valiadate First Name
	@Test
	public void validateFirstNameTest() {
		System.out.println("Enter First Name::");
		String str = sc.next();
		boolean result = user.validateFirstName(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}

	// Validate Last Name
	@Test
	public void validateLasttNameTest() {
		System.out.println("Enter Last Name::");
		String str = sc.next();
		boolean result = user.validateLasttName(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}

	// Validate Email
	@Test
	public void validaeEmailTest() {
		String str = "abc.xyz@bl.co.in";
		boolean result = user.validateEmail(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}

	// Validate Phone Number Giving Space
	@Test
	public void phoneNumberTest() {
		String str = "91 9919819801";
		boolean result = user.phoneNumber(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}

	// Validate Password
	@Test
	public void passwordTest() {
		System.out.println("Enter Password::");
		String str = sc.next();
		boolean result = user.passwordValidation(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}

	// Email Sample Validation
	@Test
	public void emailValidatorTest() {
		System.out.println("Enter Email To Validate::");
		String str = sc.nextLine();
		boolean result = user.emailValidation(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}
	//Validate First,Last Name Email,Mobile and Password With Message
	@Test
	public void validateUserEntryDataWithMessageTest() {
		System.out.println("Enter First Name::");
		String firstName= sc.nextLine();
		System.out.println("Enter First Name::");
		String lastName= sc.nextLine();
		System.out.println("Enter Email::");
		String email= sc.nextLine();
		System.out.println("Enter Mobile Number::");
		String mobileNumber= sc.nextLine();
		System.out.println("Enter Password::");
		String password= sc.nextLine();
		String result = user.validateUserEntryDataWithMessage(firstName,lastName,email,mobileNumber,password);
		String excepted ="Happy";
		assertEquals(excepted, result);
	}
}
