package edu.miu.cs.cs425.studentrecordsmgmtapp;

public class HelloWorldPrinter {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 35, 10, 14, 15, 21, 25};
        printHelloWorld(numbers);
    }

    public static void printHelloWorld(int[] numbers) {
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }
}

