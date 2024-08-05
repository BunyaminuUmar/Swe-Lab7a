package edu.miu.cs.cs425.studentrecordsmgmtapp;

public class SecondBiggestFinder {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {19, 9, 11, 0, 12};
        System.out.println("Second biggest in [1, 2, 3, 4, 5]: " + findSecondBiggest(numbers1));
        System.out.println("Second biggest in [19, 9, 11, 0, 12]: " + findSecondBiggest(numbers2));
    }

    public static int findSecondBiggest(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number != max1) {
                max2 = number;
            }
        }

        return max2;
    }
}

