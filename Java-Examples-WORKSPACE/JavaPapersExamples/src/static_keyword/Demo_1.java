package static_keyword;

public class Demo_1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.age);
		System.out.println(e1.getEmpAge());
		
		
		Employee e2 = new Employee();
		System.out.println(e2.age);
		System.out.println(e2.getEmpAge());
		
		int age = Employee.age;
		System.out.println(age);
		
		int age2 = Employee.getEmpAge();
		System.out.println(age2);
	}
}
