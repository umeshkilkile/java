package com.abstractclasses;

import java.io.IOException;
import java.net.URL;

public class Demo_4 {
	public static void main(String[] args) {
		URLProcessorImpl urlProcessor = new URLProcessorImpl();

		try {
			urlProcessor.process(new URL("http://jenkov.com"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
