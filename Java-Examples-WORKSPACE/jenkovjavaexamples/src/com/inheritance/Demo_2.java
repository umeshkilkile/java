package com.inheritance;

public class Demo_2 {
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		System.out.println("parentPublicNum1 = " + p.parentPublicNum1);

		// The field Parent2.parentPrivateNum2 is not visible
		// System.out.println("parentPrivateNum2 = " + p.parentPrivateNum2);
		System.out.println("parentProtectedNum3 = " + p.parentProtectedNum3);
		System.out.println("parentDefaultNum4 = " + p.parentDefaultNum4);

		System.out.println(p.getParentPublicNum1());
		System.out.println(p.getParentPrivateNum2());
		System.out.println(p.getParentProtectedNum3());
		System.out.println(p.getParentDefaultNum4());
		p.add();
		System.out.println("---------------------------------------------------Set1");

		Child2 c = new Child2();
		System.out.println("childPublicNum1 = " + c.childPublicNum1);
		System.out.println("parentPublicNum1 = " + c.parentPublicNum1);
		// Not visible
		// System.out.println("childPrivateNum2 = " + c.childPrivateNum2);
		// System.out.println("childPrivateNum2 = " + c.parentPrivateNum1);
		System.out.println("childProtectedNum3 = " + c.childProtectedNum3);
		System.out.println("parentProtectedNum3 = " + c.parentProtectedNum3);
		System.out.println("childDefaultNum4 = " + c.childDefaultNum4);
		System.out.println("c.parentDefaultNum4 = " + c.parentDefaultNum4);

		System.out.println(c.getChildPublicNum1());
		System.out.println(c.getParentPublicNum1());
		System.out.println(c.getChildPrivateNum2());
		System.out.println(c.getParentPrivateNum2());
		System.out.println(c.childProtectedNum3);
		System.out.println(c.parentProtectedNum3);
		System.out.println(c.childDefaultNum4);
		System.out.println(c.parentDefaultNum4);
		c.add();
		System.out.println("---------------------------------------------------Set2");

		Parent2 pc = new Child2();
		System.out.println("parentPublicNum1 = " + pc.parentPublicNum1);
		System.out.println("parentProtectedNum3 = " + pc.parentProtectedNum3);
		System.out.println("parentDefaultNum4 = " + pc.parentDefaultNum4);

		// cannot be resolved or is not a field
		// System.out.println("childPrivateNum2 = " + pc.parentPrivateNum1);
		// System.out.println("childPublicNum1 = " + pc.childPublicNum1);
		// System.out.println("childPrivateNum2 = " + pc.childPrivateNum2);
		// System.out.println("childProtectedNum3 = " + pc.childProtectedNum3);
		// System.out.println("childDefaultNum4 = " + pc.childDefaultNum4);

		System.out.println(pc.getParentPublicNum1());
		System.out.println(pc.getParentPrivateNum2());
		System.out.println(pc.parentProtectedNum3);
		System.out.println(pc.parentDefaultNum4);

		// System.out.println(pc.getChildPublicNum1());
		// System.out.println(pc.getChildPrivateNum2());
		// System.out.println(pc.childProtectedNum3);
		// System.out.println(pc.childDefaultNum4);
		pc.add();
		System.out.println("---------------------------------------------------Set3");
	}
}
