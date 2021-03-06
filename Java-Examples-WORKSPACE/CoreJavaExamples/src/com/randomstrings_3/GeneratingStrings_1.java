package com.randomstrings_3;

import java.nio.charset.Charset;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GeneratingStrings_1 {
	public static void main(String[] args) {

		// 1. Generate Random Unbounded String with Plain Java
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String generatedString = new String(array, Charset.forName("UTF-8"));
		System.out.println("generatedString = " + generatedString);

		// 2.Generate Random Bounded String with Plain Java
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString2 = buffer.toString();
		System.out.println("generatedString2 = " + generatedString2);

		// 3. Generate Bounded Random String with Apache Commons Lang
		int length = 10;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString3 = RandomStringUtils.random(length, useLetters, useNumbers);
		System.out.println("generatedString3 = " + generatedString3);

		// 4. Generate Alphabetic String with Apache Commons Lang
		String generatedString4 = RandomStringUtils.randomAlphabetic(10);
		System.out.println("generatedString4 = " + generatedString4);

		// 5. Generate Alphanumeric String with Apache Commons Lang
		String generatedString5 = RandomStringUtils.randomAlphanumeric(10);
		System.out.println("generatedString5 = " + generatedString5);
	}
}

//This random generation of string or nunbers can be used for generating OTP

