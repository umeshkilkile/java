package com.nestedclasses;

import java.util.HashMap;
import java.util.Map;

public class Cache2 {
	private Map<String, CacheEntry> cacheMap = new HashMap<String, CacheEntry>();

	public class CacheEntry {
		public long timeInserted = 0;
		public Object value = null;
	}

	public void store(String key, Object value) {
		CacheEntry entry = new CacheEntry();
		entry.value = value;
		entry.timeInserted = System.currentTimeMillis();
		this.cacheMap.put(key, entry);
	}

	public Object get(String key) {
		CacheEntry entry = this.cacheMap.get(key);
		if (entry == null)
			return null;
		return entry.value;
	}

	public CacheEntry getCacheEntry(String key) {
		return this.cacheMap.get(key);
	}
}
