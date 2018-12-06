package Item1;

/**
 * 
 * @author kilkile
 *
 *         Item 1: Consider static factory methods instead of constructors
 */

public class Account {
	private String accHolderName;
	private String accType;
	private long accNo;

	private Account() {
	}

	private Account(String accHolderName, String accType, long accNo) {
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.accNo = accNo;
	}

	/*
	 * Advantage-1 : Unlike constructors, they have names (createAccount).
	 */
	/**
	 * 
	 * @param accHolderName
	 * @param accType
	 * @param accNo
	 * @return Account
	 */
	public static Account createAccount(String accHolderName, String accType, long accNo) {
		return new Account(accHolderName, accType, accNo);
	}

	@Override
	public String toString() {
		return "AccHolderName : " + accHolderName + ", AccType : " + accType + ", AccNo : " + accNo;
	}

	/*
	 * Advantage-2: A second advantage of static factory methods is that, unlike
	 * constructors, they are not required to create a new object each time
	 * they’re invoked.
	 */
	public static Boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}
}

/*
 * Advantage-3: A third advantage of static factory methods is that, unlike
 * constructors, they can return an object of any subtype of their return type.
 * 
 * Advantage-4: A fourth advantage of static factory methods is that they reduce
 * the verbosity of creating parameterized type instances. OR A fourth advantage
 * of static factories is that the class of the returned object can vary from
 * call to call as a function of the input parameters.
 * 
 * Advantage-5: A fifth advantage of static factories is that the class of the
 * returned object need not exist when the class containing the method is
 * written. Such flexible static factory methods form the basis of service
 * provider frameworks, like the Java Database Connectivity API (JDBC). A
 * service provider framework is a system in which providers implement a
 * service, and the system makes the implementations available to clients,
 * decoupling the clients from the implementations.
 * 
 * There are three essential components in a service provider framework:
 * 
 * - a service interface, which represents an implementation;
 * 
 * - a provider registration API, which providers use to register
 * implementations; and
 * 
 * - a service access API, which clients use to obtain instances of the service.
 * The service access API may allow clients to specify criteria for choosing an
 * implementation. In the absence of such criteria, the API returns an instance
 * of a default implementation, or allows the client to cycle through all
 * available implementations. The service access API is the flexible static
 * factory that forms the basis of the service provider framework.
 * 
 * - An optional fourth component of a service provider framework is a service
 * provider interface, which describes a factory object that produce instances
 * of the service interface. In the absence of a service provider interface,
 * implementations must be instantiated reflectively (Item 65). In the case of
 * JDBC, Connection plays the part of the service interface,
 * DriverManager.registerDriver is the provider registration API,
 * DriverManager.getConnection is the service access API, and Driver is the
 * service provider interface.
 * 
 * - Limitations
 * 
 * - The main limitation of providing only static factory methods is that
 * classes without public or protected constructors cannot be subclassed.
 * 
 * - A second shortcoming of static factory methods is that they are hard for
 * programmers to find. They do not stand out in API documentation in the way
 * that constructors do, so it can be difficult to figure out how to instantiate
 * a class that provides static factory methods instead of constructors.
 */
