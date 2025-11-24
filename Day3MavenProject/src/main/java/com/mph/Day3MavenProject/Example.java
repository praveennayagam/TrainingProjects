package com.mph.Day3MavenProject;

import java.util.function.Predicate;

public class Example {

	public static void main(String[] args) {
		String[] s = {"Arun","Praveen","Abi","Barath","Akilesh"};

      
        Predicate<String> startsWithALambda = str -> str.startsWith("A");

        Predicate<String> startsWithAMR = StringUtils::startsWithA;

        System.out.println("Names starting with A Lambda:");
        for (String name : s) {
            if (startsWithALambda.test(name)) {
                System.out.println(name);
            }
        }

        System.out.println("Names starting with A Method Reference:");
        for (String name : s) {
            if (startsWithAMR.test(name)) {
                System.out.println(name);
            }
        }
    }
}

class StringUtils {
    public static boolean startsWithA(String name) {
        return name.startsWith("A");
    }
}