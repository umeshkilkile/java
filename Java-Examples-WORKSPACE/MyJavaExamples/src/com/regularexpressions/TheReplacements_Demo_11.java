package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheReplacements_Demo_11 {
	public static void main(String[] args) throws Exception {
		String s = "As long as there is injustice, whenever a\n" + "Targathian baby cries out, wherever a distress\n"
				+ "signal sounds among the stars ... We�ll be there.\n" + "This fine ship, and this fine crew ...\n"
				+ "Never give up! Never surrender!";
		// Match the specially commented block of text above:
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
		if (mInput.find())
			s = mInput.group(1); // Captured by parentheses
		// Replace two or more spaces with a single space:
		s = s.replaceAll(" {2,}", " ");
		// Replace one or more spaces at the beginning of each
		// line with no spaces. Must enable MULTILINE mode:
		s = s.replaceAll("(?m)^ +", "");
		System.out.println(s);
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		StringBuffer sbuf = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher(s);
		// Process the find information as you
		// perform the replacements:
		while (m.find())
			m.appendReplacement(sbuf, m.group().toUpperCase());
		// Put in the remainder of the text:
		m.appendTail(sbuf);
		System.out.println(sbuf);
	}
}
