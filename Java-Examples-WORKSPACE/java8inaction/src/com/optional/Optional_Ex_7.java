package com.optional;

import java.util.Optional;
import java.util.Properties;

public class Optional_Ex_7 {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("a", "5");
		props.setProperty("b", "true");
		props.setProperty("c", "-3");

		System.out.println(readDuration(props, "a"));
		System.out.println(readDuration(props, "b"));
		System.out.println(readDuration(props, "c"));
		System.out.println(readDuration(props, "d"));

		System.out.println(readDuration2(props, "a"));
		System.out.println(readDuration2(props, "b"));
		System.out.println(readDuration2(props, "c"));
		System.out.println(readDuration2(props, "d"));
	}

	public static int readDuration(Properties props, String name) {
		String value = props.getProperty(name);
		if (value != null) {
			try {
				int i = Integer.parseInt(value);
				if (i > 0) {
					return i;
				}
			} catch (NumberFormatException e) {

			}
		}
		return 0;
	}

	public static int readDuration2(Properties props, String name) {
		return Optional.ofNullable(props.getProperty(name)).flatMap(Optional_Ex_6::stringToInt).filter(i -> i > 0)
				.orElse(0);
	}
}
