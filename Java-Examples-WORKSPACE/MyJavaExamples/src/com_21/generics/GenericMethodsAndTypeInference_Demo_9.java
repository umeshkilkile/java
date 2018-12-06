package com_21.generics;

public class GenericMethodsAndTypeInference_Demo_9 {
	public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}

	public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
		int counter = 0;
		for (Box<U> box : boxes) {
			U boxContents = box.get();
			System.out.println("Box #" + counter + " contains ["
					+ boxContents.toString() + "]");
			counter++;
		}
	}

	public static void main(String[] args) {
		java.util.ArrayList<Box<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
		
		/*
		 * To invoke the generic method addBox, you can specify the type parameter with a type witness as follows:
		 */
		GenericMethodsAndTypeInference_Demo_9.<Integer> addBox(Integer.valueOf(10), listOfIntegerBoxes);
		
		/*
		 * Alternatively, if you omit the type witness,a Java compiler automatically infers (from the method's arguments) 
		 * that the type parameter is Integer:
		 */
		GenericMethodsAndTypeInference_Demo_9.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		GenericMethodsAndTypeInference_Demo_9.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		
		GenericMethodsAndTypeInference_Demo_9.outputBoxes(listOfIntegerBoxes);
	}
}
