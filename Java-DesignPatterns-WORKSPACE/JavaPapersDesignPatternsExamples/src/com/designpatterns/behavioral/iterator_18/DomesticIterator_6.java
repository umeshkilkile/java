package com.designpatterns.behavioral.iterator_18;

import java.util.List;

public class DomesticIterator_6 implements Iterator_4 {
	List<Animal_1> animalList;
	private int position;

	public DomesticIterator_6(List<Animal_1> animalList) {
		this.animalList = animalList;
	}

	@Override
	public Animal_1 nextAnimal() {
		Animal_1 animal = null;
		for (; position < animalList.size(); position++) {
			if ("Domestic".equals(((Animal_1) animalList.get(position)).getAnimalType())) {
				animal = (Animal_1) animalList.get(position);
				position++;
				break;
			}
		}
		return animal;
	}

	@Override
	public boolean isLastAnimal() {
		for (int i = position; i < animalList.size(); i++) {
			if ("Domestic".equals(((Animal_1) animalList.get(i)).getAnimalType())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Animal_1 currentAnimal() {
		if (position < animalList.size()) {
			return (Animal_1) animalList.get(position);
		}
		return null;
	}

}
