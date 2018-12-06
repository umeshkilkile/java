package com.comp;

public class Demo_2 {
	public static void main(String[] args) {
		NewsReader2 newsReader2 = new NewsReader2();
		String s = newsReader2.read();
		System.out.println(s);
		
		String s1 = Reader2.staticRead();
		System.out.println(s1);
		
		Reader2 r = new NewsReader2();
		String s2 = r.read();
		System.out.println(s2);
		
		String s3 = Reader2.staticRead();
		System.out.println(s3);
	}
}
