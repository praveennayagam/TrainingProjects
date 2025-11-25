package com.mphasis;

import java.util.Arrays;

public class ArrayPointer<T>{//arrayprinter not pointer
	
	private T[] arr;

	public ArrayPointer() {
		super();
	}

	public ArrayPointer(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "ArrayPointer [arr=" + Arrays.toString(arr) + "]";
	}
	
	
}
