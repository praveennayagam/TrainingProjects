package com.mphasis;

public class ComplexNumber {
	
	int real;
	int imag;
	public ComplexNumber() {
		super();
	}
	public ComplexNumber(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", imag=" + imag + "]";
	}
	

}
