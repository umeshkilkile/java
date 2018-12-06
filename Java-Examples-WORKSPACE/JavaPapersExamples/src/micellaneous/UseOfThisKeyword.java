package micellaneous;

public class UseOfThisKeyword {

	/*
	 * 1) To specifically denote that the instance variable is used instead of
	 * static or local variable.
	 */
	private String javaFAQ;
	private boolean bool;

	void methodName(String javaFAQ) {
		this.javaFAQ = javaFAQ;
	}

	/*
	 * 2) Java ‘this’ is used to refer the constructors
	 */
	UseOfThisKeyword(String javapapers) {
		this(javapapers, true);
		System.out.println("Inside single arg constructor");
	}

	UseOfThisKeyword() {
		System.out.println("Inside no arg constructor");
	}

	UseOfThisKeyword(String val, boolean bool) {
		// System.out.println("Inside two arg constructor"); //You can't put any line here because
		// "Constructor call must be the first statement in a constructor"
		this();
		System.out.println("Inside two arg constructor");
		this.javaFAQ = val;
		this.bool = bool;
	}
	
	/*
	 * 3) java this can also be used to return the current instance
	 */
	public UseOfThisKeyword  getClassByThis(){
		return this;
	}
	
	public void getClassNameByThis(){
		Class<? extends UseOfThisKeyword> className = this.getClass(); // this methodology is preferable in java
		System.out.println("UseOfThisKeyword.getClassNameByThis() : " + className.getCanonicalName());
	}
	
	public static void main(String[] args) {
		UseOfThisKeyword keyword = new UseOfThisKeyword();

		UseOfThisKeyword keyword2 = new UseOfThisKeyword("Somevalue");
		
		System.out.println(new UseOfThisKeyword().getClassByThis());
		
		new UseOfThisKeyword().getClassNameByThis();
		
		
	}
}
