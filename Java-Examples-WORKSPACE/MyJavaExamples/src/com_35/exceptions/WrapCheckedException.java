package com_35.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new FileNotFoundException();
			case 1:
				throw new IOException();
			case 2:
				throw new RuntimeException("Where am I?");
			default:
				return;
			}
		} catch (Exception e) { // Adapt to unchecked:
			throw new RuntimeException(e);
		}
	}
}
