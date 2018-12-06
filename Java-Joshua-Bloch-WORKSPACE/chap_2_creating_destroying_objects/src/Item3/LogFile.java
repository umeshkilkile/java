package Item3;

import java.io.Serializable;

/**
 * 
 * @author kilkile
 *
 *         Item-3: Enforce the singleton property with a private constructor or
 *         an enum type
 */
public final class LogFile implements Serializable {

	private static final long serialVersionUID = -1931240253521176445L;

	/*
	 * To maintain the singleton guarantee , you have to declare all instance fields transient and provide readResolve method.
	 */
	private static final transient LogFile INSTANCE = new LogFile();

	private StringBuilder sb = new StringBuilder();

	// The private constructor is called only once, to initialize the public
	// static final field LogFile.INSTANCE
	private LogFile() {
		System.out.println("Inside LogFile private constructor");
	}

	public void writeToFile(String content) {
		sb.append(content);
		System.out.println(sb.toString());
	}

	public static LogFile getInstance() {
		return INSTANCE;
	}

	// readResolve method to preserve singleton property
	private Object readResolve() {
		// Return the one true LogFile and let the garbage collector
		// take care of the LogFile impersonator.
		return INSTANCE;
	}

}
