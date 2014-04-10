package com.rmuti.datastructure;

public class ArrayList {
	private Object[] elementData = new Object[1];
	private int size = 0;

	// ------------Method add data in array----------------//
	public void add(Object e) {
		add(size, e);
	}

	public void add(int i, Object e) {

		ensureCapacity(size + 1);
		for (int j = size - 1; j >= i; j--) {
			elementData[j + 1] = elementData[j];
		}
		elementData[i] = e;
		size++;
	}
	// ------------Method Enlarge array----------------//
	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int s = 2 * elementData.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;

		}
	}
	// ------------Method Remove array----------------//
	public void remove(int i) {
		for (int j = i; j < size - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
		size--;

	}
	// ------------Method add array[0]----------------//
	public void addFirst(Object e) {
		add(0, e);
	}
	// ------------Method add array[Last]----------------//
	public void addLast(Object e) {
		elementData[size - 1] = e;
	}
	// ------------Method watch data from array[Last]----------------//
	public Object get(int a) {
		Object get = elementData[a];
		return get;
	}
	// ------------Method add [data,data,data]----------------//
	public String toString() {
		String ret = "[";

		for (int i = 0; i < size; i++) {

			ret = ret + elementData[i];
			if (i < size - 1) {
				ret += ",";
			}

		}

		ret += "]";
		return ret;
	}

}
