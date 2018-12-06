package com.reusing.classes;

class Triangle extends Shape {
Triangle(int i) {
super(i);
System.out.println("Drawing Triangle");
}
void dispose() {
	System.out.println("Erasing Triangle");
super.dispose();
}
}
