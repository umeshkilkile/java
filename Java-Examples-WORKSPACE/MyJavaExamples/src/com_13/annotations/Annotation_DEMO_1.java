package com_13.annotations;

@ClassPreamble(
		author = "Umesh S Kilkile", 
		date = "13/10/2014", 
		reviewers = {"Umesh", "Kilkile" }, 
		currentRevision = 2, 
		lastModified = "Umesh", 
		lastModifiedBy = "Umesh")
public class Annotation_DEMO_1 {

	int value = 10;

	public int getValue() {
		return value;
	}
	public static void main(String[] args) {
		Annotation_DEMO_1 annotationDemo_1 = new Annotation_DEMO_1();
		System.out.println(annotationDemo_1.getValue());
	}
}
