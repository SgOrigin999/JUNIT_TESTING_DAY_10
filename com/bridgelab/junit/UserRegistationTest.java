package com.bridgelab.junit;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UserRegistationTest {
	UserRegistation user = new UserRegistation();
	Scanner sc = new Scanner(System.in);

	// Validate Multiple Entry of Email Address Using Parameterized Test
	@ParameterizedTest(name = "#{index} - Run test with email = {0}")
	@MethodSource("validEmailProvider")
	public void validateMultipleEntryOfValidEmailAddress(String email) {
		boolean result = user.emailValidation(email);
		boolean excepted = true;
		assertEquals(excepted, result);
	}

	@ParameterizedTest(name = "#{index} - Run test with email = {0}")
	@MethodSource("inValidEmailProvider")
	public void validateMultipleEntryOfInvalidEmailAddress(String email) {
		boolean result = user.emailValidation(email);
		boolean excepted = false;
		assertEquals(excepted, result);
	}

	static Stream<String> validEmailProvider() {
		return Stream.of("abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
				"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com");
	}

	static Stream<String> inValidEmailProvider() {
		return Stream.of("abc", "abc@.com.my", "abc100@yahoo.a", "abc100@.com", "abc100@.com.com", ".abc@abc.com",
				"abc()*@gmail.com", "abc@%*.com", "abc..100@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au");
	}

	// Validate First Name
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

	// Validate First,Last Name Email,Mobile and Password With Message
	@Test
	public void validateUserEntryDataWithMessageTest() {
		System.out.println("Enter First Name::");
		String firstName = sc.nextLine();
		System.out.println("Enter First Name::");
		String lastName = sc.nextLine();
		System.out.println("Enter Email::");
		String email = sc.nextLine();
		System.out.println("Enter Mobile Number::");
		String mobileNumber = sc.nextLine();
		System.out.println("Enter Password::");
		String password = sc.nextLine();
		String result = user.validateUserEntryDataWithMessage(firstName, lastName, email, mobileNumber, password);
		String excepted = "Happy";
		assertEquals(excepted, result);
	}
}
