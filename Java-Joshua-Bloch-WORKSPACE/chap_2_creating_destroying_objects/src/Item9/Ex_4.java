package Item9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex_4 {
	// try-with-resources on multiple resources - short and sweet
	static void copy(String src, String dst) throws IOException {
		int BUFFER_SIZE = 2056;
		try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
			byte[] buf = new byte[BUFFER_SIZE];
			int n;
			while ((n = in.read(buf)) >= 0)
				out.write(buf, 0, n);
		}
	}
}

/*
 * Not only are the try-with-resources versions shorter and more readable than
 * the originals, but they provide far better diagnostics. Consider the
 * firstLineOfFile method. If exceptions are thrown by both the readLine call
 * and the (invisible) close, the latter exception is suppressed in favor of the
 * former. In fact, multiple exceptions may be suppressed in order to preserve
 * the exception that you actually want to see. These suppressed exceptions are
 * not merely discarded; they are printed in the stack trace with a notation
 * saying that they were suppressed. You can also access them programmatically
 * with the getSuppressed method, which was added to Throwable in Java 7.
 */