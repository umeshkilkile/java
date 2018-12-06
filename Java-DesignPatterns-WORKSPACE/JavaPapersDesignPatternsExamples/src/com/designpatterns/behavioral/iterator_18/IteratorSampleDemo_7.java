package com.designpatterns.behavioral.iterator_18;

public class IteratorSampleDemo_7 {
	public static void main(String args[]) {
		ZooImpl_3 zoo = new ZooImpl_3();
		zoo.addAnimal(new Animal_1("Tiger", "Wild"));
		zoo.addAnimal(new Animal_1("Lion", "Wild"));
		zoo.addAnimal(new Animal_1("Tom Cat", "Domestic"));
		zoo.addAnimal(new Animal_1("Raging Bull", "Wild"));
		zoo.addAnimal(new Animal_1("Scooby Doo", "Domestic"));
		Iterator_4 wildIterator = zoo.createIterator("Wild");
		while (!wildIterator.isLastAnimal()) {
			System.out.println("Wild Animal: " + wildIterator.nextAnimal().getAnimalName());
		}
		Iterator_4 domesticIterator = zoo.createIterator("Domestic");
		while (!domesticIterator.isLastAnimal()) {
			System.out.println("Domestic Animal: " + domesticIterator.nextAnimal().getAnimalName());
		}
	}

}
