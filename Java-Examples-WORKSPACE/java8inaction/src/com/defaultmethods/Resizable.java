package com.defaultmethods;

public interface Resizable extends Drawable {
	int getWidth();

	int getHeight();

	void setWidth(int width);

	void setHeight(int height);

	void setAbsoluteSize(int width, int height);

	// Adding a new method
	// void setRelativeSize(int wFactor, int hFactor);

	default void setRelativeSize(int wFactor, int hFactor) {
		setAbsoluteSize(getWidth() / wFactor, getHeight() / hFactor);
	}
}
