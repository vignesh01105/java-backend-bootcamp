package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers

        int[] numbers = {12,132,14,56,67};
        int sum = 0;
        double average = 0.0;
        int largest = numbers[0];
        System.out.println("The values are ");
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for(int i =0; i < numbers.length; i++){
            sum += numbers[i];
            if(largest < numbers[i])
                largest = numbers[i];
        }

        average = sum/ numbers.length;
        System.out.println("largest = " + largest);
        System.out.println("sum = " +sum);
        System.out.println("average = " + average);
    }
}
