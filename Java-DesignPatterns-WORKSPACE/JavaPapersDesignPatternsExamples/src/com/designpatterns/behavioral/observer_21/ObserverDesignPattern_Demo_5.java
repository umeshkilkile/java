package com.designpatterns.behavioral.observer_21;

public class ObserverDesignPattern_Demo_5 {
	public static void main(String args[]) {
		Blog_4 blog = new Blog_4();
		User_3 user1 = new User_3();
		User_3 user2 = new User_3();
		blog.registerObserver(user1);
		blog.registerObserver(user2);
		user1.setSubject(blog);
		user2.setSubject(blog);
		System.out.println(user1.getArticle());
		blog.postNewArticle();
		System.out.println(user1.getArticle());
	}

}
