package com.defaultmethods;

import java.util.Arrays;
import java.util.List;

public class Game_Ex_3 {
	public static void main(String... args) {
		List<Resizable> resizableShapes = Arrays.asList(new Square(), new Triangle(), new Ellipse());
		Utils.paint(resizableShapes);
	}
}
