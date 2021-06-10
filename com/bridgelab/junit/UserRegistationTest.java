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
}
