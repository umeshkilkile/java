package Item29;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Item 29: Consider typesafe heterogeneous containers
 *
 */
public class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

	public <T> void putFavorite(Class<T> type, T instance) {
		if (type == null)
			throw new NullPointerException("Type is null");
		favorites.put(type, instance);
	}

	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}
}
/*
 * NOTES:
 * 
 * A Favorites instance is typesafe: it will never return an Integer when you
 * ask it for a String. It is also heterogeneous: unlike an ordinary map, all
 * the keys are of different types. Therefore, we call Favorites a typesafe
 * heterogeneous container.
 */
