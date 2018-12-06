package com.interfaces.abstractclassess;

import java.io.IOException;
import java.net.URL;

public class Demo_1 {
	public static void main(String[] args) {
		URLProcessor urlProcessor = new URLProcessorImpl();
		try {
			urlProcessor.process(new URL("http://jenkov.com"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
