package org.example.lesson_01;

public class Arrays {
    static void main() {
        int[] numbers = new int[10];
        IO.println("Numbers: " + java.util.Arrays.toString(numbers));
        // output: Numbers: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        numbers[0] = 1;
        numbers[2] = 3;
        IO.println("Numbers: " + java.util.Arrays.toString(numbers));
        // output: Numbers: [1, 0, 3, 0, 0, 0, 0, 0, 0, 0]

        int first_element = numbers[0];
        IO.println("first_element: " + first_element);
        // output: first_element: 1

        int length_numbers = numbers.length;
        IO.println("length of numbers: " + length_numbers);
        // output: length of numbers: 10
    }
}
