package com.designpatterns.behavioral.observer_21;

public class User_3 implements Observer_1 {

	private String article;
	private Subject_2 blog;

	public void setSubject(Subject_2 blog) {
		this.blog = blog;
		article = "No New Article!";
	}

	@Override
	public void update() {
		System.out.println("State change reported by Subject.");
		article = (String) blog.getUpdate();
	}

	public String getArticle() {
		return article;
	}
}
