package com.nestedclasses;

public class CacheDemo {
	public static void main(String[] args) {
		Cache cache = new Cache();
		cache.store("Umesh", "Kilkile");
		cache.store("Umesh1", "Kilkile1");

		Object obj = cache.get("Umesh");
		System.out.println(obj);

		Cache2 cache2 = new Cache2();
		cache2.store("USA", "New York");
		cache2.store("France", "Paris");
		
		Object obj2 = cache2.get("France");
		System.out.println(obj2);
		
		Cache2.CacheEntry cacheEntry = cache2.getCacheEntry("USA");
		System.out.println(cacheEntry.timeInserted);
		System.out.println(cacheEntry.value);
		
		
	}
}
