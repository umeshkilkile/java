package com.designpatterns.behavioral.iterator_18;

import java.util.ArrayList;
import java.util.List;

public class ZooImpl_3 implements IZoo_2 {
	List<Animal_1> animalList;

	public ZooImpl_3() {
		animalList = new ArrayList<Animal_1>();
	}

	@Override
	public List<Animal_1> getAnimals() {
		return animalList;
	}

	@Override
	public void addAnimal(Animal_1 animal) {
		animalList.add(animal);
	}

	@Override
	public void removeAnimal(Animal_1 animal) {
		animalList.remove(animal);
	}

	@Override
	public Iterator_4 createIterator(String iteratorType) {
		if ("Wild".equals(iteratorType)) {
			return new WildIterator_5(animalList);
		} else {
			return new DomesticIterator_6(animalList);
		}
	}

}
