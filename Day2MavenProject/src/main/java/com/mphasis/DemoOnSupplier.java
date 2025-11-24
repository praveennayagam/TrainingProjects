package com.mphasis;

import java.util.function.Supplier;

public class DemoOnSupplier {

	public static void main(String[] args) {
		
		String name="Praveen";
		
		Supplier<String> supplier=()->name.toUpperCase();
		System.out.println(supplier.get());
		
		Supplier<Integer>randomSupplier=()->{
			return (int)Math.round(Math.random()*10000);
		};
		System.out.println(randomSupplier.get());

	}

}
