package com_6.operators;

public class Value2 {
	int i;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value2 other = (Value2) obj;
		if (i != other.i)
			return false;
		return true;
	}

}
