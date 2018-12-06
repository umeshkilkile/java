package Item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex_5 {
	// try-with-resources with a catch clause
	static String firstLineOfFile(String path, String defaultVal) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		} catch (IOException e) {
			return defaultVal;
		}
	}
}

/*
 * You can put catch clauses on try-with-resources statements, just as you can
 * on regular try-finally statements. This allows you to handle exceptions
 * without sullying your code with another layer of nesting. As a slightly
 * contrived example, here’s a version our firstLineOfFile method that does not
 * throw exceptions, but takes a default value to return if it can’t open the
 * file or read from it:
 * 
 * 
 * The lesson is clear: Always use try-with- resources in preference to*
 * tryfinally when working with resources that must be closed.The resulting*
 * code is shorter and clearer, and the exceptions that it generates are
 * more*useful.The try-with- resources statement makes it easy to write correct
 * code* using resources that must be closed, which was practically impossible
 * using*tryfinally.
 */