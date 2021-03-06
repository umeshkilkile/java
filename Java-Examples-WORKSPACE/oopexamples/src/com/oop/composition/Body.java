package com.oop.composition;

public class Body {
	public Heart heart;

	Body(Heart heart) {
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	@Override
	public String toString() {
		return "Body [heart=" + heart + "]";
	}

}
