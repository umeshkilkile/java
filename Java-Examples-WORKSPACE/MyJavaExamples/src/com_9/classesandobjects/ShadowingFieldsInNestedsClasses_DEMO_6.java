package com_9.classesandobjects;

public class ShadowingFieldsInNestedsClasses_DEMO_6 {

	ShadowingFieldsInNestedsClasses_DEMO_6(){
		System.out.println("ShadowingFieldsInNestedsClasses_6.ShadowingFieldsInNestedsClasses_6()");
	}
	
	public int x = 0;

	class FirstLevel {
		
		public FirstLevel() {
			System.out.println("ShadowingFieldsInNestedsClasses_6.FirstLevel.FirstLevel()");
		}

		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = "
					+ ShadowingFieldsInNestedsClasses_DEMO_6.this.x);
		}
	}

	public static void main(String... args) {
		ShadowingFieldsInNestedsClasses_DEMO_6 st = new ShadowingFieldsInNestedsClasses_DEMO_6();
		ShadowingFieldsInNestedsClasses_DEMO_6.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}
