package com.refactoringoldcode;

public class ObserverDesignPatternUsingLambda_Ex_8 {
	public static void main(String[] args) {
		Feed lambdaFeed = new Feed();

		lambdaFeed.registerObserver((String tweet) -> {
			if (tweet != null && tweet.contains("money")) {
				System.out.println("Breaking news in NY! " + tweet);
			}
		});
		lambdaFeed.registerObserver((String tweet) -> {
			if (tweet != null && tweet.contains("queen")) {
				System.out.println("Yet another news in London... " + tweet);
			}
		});
		lambdaFeed.notifyObservers("Money money money, give me money!");
	}
}
