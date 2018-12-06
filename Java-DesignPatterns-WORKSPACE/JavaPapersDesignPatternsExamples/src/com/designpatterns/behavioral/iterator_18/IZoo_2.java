package com.designpatterns.behavioral.iterator_18;

import java.util.List;

public interface IZoo_2 {
	public List getAnimals();

	public void addAnimal(Animal_1 animal);

	public void removeAnimal(Animal_1 animal);

	public Iterator_4 createIterator(String iteratorType);

}
