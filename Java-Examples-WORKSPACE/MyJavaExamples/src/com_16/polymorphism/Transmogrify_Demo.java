package com_16.polymorphism;

/*
 * Dynamically changing the behavior of an object via composition (the "State"
 * design pattern).
 */
public class Transmogrify_Demo {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}
/*
 * - A better approach is to choose composition first, especially when it�s not
 * obvious which one you should use. Composition does not force a design into an
 * inheritance hierarchy. But composition is also more flexible since it�s
 * possible to dynamically choose a type (and thus behavior) when using
 * composition, whereas inheritance requires an exact type to be known at
 * compile time.
 * 
 * - A general guideline is �Use inheritance to express differences in behavior,
 * and fields to express variations in state.� In the preceding example, both
 * are used; two different classes are inherited to express the difference in
 * the act( ) method, and Stage uses composition to allow its state to be
 * changed. In this case, that change in state happens to produce a change in
 * behavior.
 */