package com.oop.composition;

public class Composition_Demo {
	public static void main(String[] args) {

		Heart heart = new Heart("Pumping O +ve", 72);

		Body body = new Body(heart);

		System.out.println(body);
	}
}