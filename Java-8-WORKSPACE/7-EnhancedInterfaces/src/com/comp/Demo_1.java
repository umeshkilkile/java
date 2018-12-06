package com.comp;

public class Demo_1 {
	public static void main(String[] args) {
		NewsReader newsReader = new NewsReader();
		String s = newsReader.read();
		System.out.println(s);
		
		String s1 = newsReader.defaultRead();
		System.out.println(s1);
		
		Reader r = new NewsReader();
		String s2 = r.read();
		System.out.println(s2);
		
		String s3 = r.defaultRead();
		System.out.println(s3);
	}
}
