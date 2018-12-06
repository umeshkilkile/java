package com_36.basicinputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreams_Demo_4 {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("C:\\xanadu.txt"));
			outputStream = new BufferedWriter(new FileWriter("C:\\characteroutput.txt"));

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}

/*
 * There are four buffered stream classes used to wrap unbuffered streams:
 * BufferedInputStream and BufferedOutputStream create buffered byte streams,
 * while BufferedReader and BufferedWriter create buffered character streams.
 */
