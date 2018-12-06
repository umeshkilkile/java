package com.access.specifiers2;

public class OrganizedByAccess_Demo {

	public int public1;
	public int public2;

	public void public1() {
	}

	public void public2() {
	}

	protected int protected1;
	protected int protected2;

	protected void protected1() {
	}

	protected void protected2() {
	}

	int default1;
	int default2;

	void default1() {
	}

	void default2() {
	}

	private int private1;
	private int private2;

	private void private1() {
	}

	private void private2() {
	}

}

/*
 * For clarity, you might prefer a style of creating classes that puts the
 * public members at the beginning, followed by the protected, package-access,
 * and private members. The advantage is that the user of the class can then
 * read down from the top and see first what’s important to them (the public
 * members, because they can be accessed outside the file), and stop reading
 * when they encounter the non-public members, which are part of the internal
 * implementation:
 */