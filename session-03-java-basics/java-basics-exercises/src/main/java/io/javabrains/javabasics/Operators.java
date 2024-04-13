package io.javabrains.javabasics;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
            int somuage = 10;
            int ramuage = 15;
        // Step 2: Perform arithmetic operations

            int totalage = somuage + ramuage;
        // Step 3: Print the results of the arithmetic operations
        System.out.println("totalage = " + totalage);

        // Step 4: Perform increment and decrement operations
        somuage++;
        ramuage--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("somuage = " + somuage);
        System.out.println("ramuage = " + ramuage);

        // Step 6: Perform comparison operations
        boolean somuagehigher = somuage < ramuage;

        // Step 7: Print the results of the comparison operations
        System.out.println("Somuage is lower"+ somuagehigher);

        // Step 8: Perform logical operations
        boolean isEqual = (somuage == ramuage);


        // Step 9: Print the results of the logical operations

        System.out.println("Somu and Ramu age is same " + isEqual);
    }
}
