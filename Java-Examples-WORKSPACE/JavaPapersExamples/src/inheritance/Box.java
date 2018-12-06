package inheritance;

public class Box {
	int w,h,d;
	
	Box(int w, int h, int d){
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	Box(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	Box(int w){
		this.w = w;
	}
}
