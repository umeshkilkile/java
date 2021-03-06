package com_35.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TurnOffChecking_Demo {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		// You can call throwRuntimeException() without a try block, and let
		// RuntimeExceptions leave the method:
		wce.throwRuntimeException(3);
		// Or you can choose to catch exceptions:
		for (int i = 0; i < 4; i++)
			try {
				if (i < 3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();
			} catch (SomeOtherException e) {
				System.out.println("SomeOtherException: " + e);
			} catch (RuntimeException re) {
				try {
					throw re.getCause();
				} catch (FileNotFoundException e) {
					System.out.println("FileNotFoundException: " + e);
				} catch (IOException e) {
					System.out.println("IOException: " + e);
				} catch (Throwable e) {
					System.out.println("Throwable: " + e);
				}
			}
	}
}
/*
 * - WrapCheckedException.throwRuntimeException( ) contains code that generates
 * different types of exceptions. These are caught and wrapped inside
 * RuntimeException objects, so they become the "cause" of those exceptions.
 * 
 * - In TurnOffChecking, you can see that it�s possible to call
 * throwRuntimeException( ) with no try block because the method does not throw
 * any checked exceptions. However, when you�re ready to catch exceptions, you
 * still have the ability to catch any exception you want by putting your code
 * inside a try block. You start by catching all the exceptions you explicitly
 * know might emerge from the code in your try block�in this case,
 * SomeOtherException is caught first. Lastly, you catch RuntimeException and
 * throw the result of getCause( ) (the wrapped exception). This extracts the
 * originating exceptions, which can then be handled in their own catch clauses.
 */
