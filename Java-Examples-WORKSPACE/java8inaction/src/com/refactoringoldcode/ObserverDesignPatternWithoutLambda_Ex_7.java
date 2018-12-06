package com.refactoringoldcode;

/*
  The observer design pattern is a common solution when an object (called the subject) needs to
automatically notify a list of other objects (called observers) when some event happens (for
example, a state change). You typically come across this pattern when working with GUI
applications. You register a set of observers on a GUI component such as button. If the button is
clicked, the observers are notified and can execute a specific action. But the observer pattern
isn’t limited to GUIs. For example, the observer design pattern is also suitable in a situation
where several traders (observers) may wish to react to the change of price of a stock (subject).
 */
public class ObserverDesignPatternWithoutLambda_Ex_7 {
	public static void main(String[] args) {
		Feed f = new Feed();
		f.registerObserver(new NYTimes());
		f.registerObserver(new Guardian());
		f.registerObserver(new LeMonde());
		f.notifyObservers("The queen said her favourite book is Java 8 in Action!");
	}
}
