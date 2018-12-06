package com.designpatterns.structural.composite_9;

public class CompositeDesignPattern_Demo_4 {
	public static void main(String[] args) {
		// Initialize three blocks
		Block_2 block1 = new Block_2();
		Block_2 block2 = new Block_2();
		Block_2 block3 = new Block_2();

		// Initialize three structure
		Structure_3 structure = new Structure_3();
		Structure_3 structure1 = new Structure_3();
		Structure_3 structure2 = new Structure_3();

		// Composes the groups
		structure1.add(block1);
		structure1.add(block2);

		structure2.add(block3);

		structure.add(structure1);
		structure.add(structure2);

		structure.assemble();
	}
}
