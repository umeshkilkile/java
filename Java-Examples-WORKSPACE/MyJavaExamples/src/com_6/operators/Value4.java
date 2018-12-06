package com_6.operators;

public class Value4 {
	int i;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value4 other = (Value4) obj;
		if (i != other.i)
			return false;
		return true;
	}

}
