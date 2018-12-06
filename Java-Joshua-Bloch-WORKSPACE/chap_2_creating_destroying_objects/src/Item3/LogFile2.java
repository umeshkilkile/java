package Item3;

/*
 * A single-element enum type is the best way to implement a singleton
 */
public enum LogFile2 {
	INSTANCE;

	public void writeToFile(String content) {
		System.out.println(content);
	}
}

/*
 * This approach is similar to the public field approach, but it is more
 * concise, provides the serialization machinery for free, and provides an
 * ironclad guarantee against multiple instantiation, even in the face of
 * sophisticated serialization or reflection attacks. This approach may feel a
 * bit unnatural, but a single-element enum type is often the best way to
 * implement a singleton. Note that you can’t use this approach if your
 * singleton must extend a superclass other than Enum (though you can declare an
 * enum to implement interfaces).
 */