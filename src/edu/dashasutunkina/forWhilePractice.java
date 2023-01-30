package edu.dashasutunkina;

import java.util.Scanner;

public class forWhilePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println(result);
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = result; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
