package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables

        int age = 10;
        // Step 2: Convert primitive variables to wrapper objects
        Integer i  = age;
        // Step 3: Print the values of the wrapper objects
        System.out.println("my age is = " + i);
        // Step 4: Convert wrapper objects back to primitive variables
        age = i;
        // Step 5: Print the values of the primitive variables
        System.out.println("My age is = " + age);
    }
}
