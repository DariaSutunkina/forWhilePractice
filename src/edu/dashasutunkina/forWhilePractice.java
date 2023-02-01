package edu.dashasutunkina;

import java.math.BigInteger;
import java.util.Scanner;

public class forWhilePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        BigInteger result = factorial(number);
        System.out.println("Result of %s factorial(number)" + result);
    }

    public static BigInteger factorial(int number) {
        if (number <= 15) {
            BigInteger result = BigInteger.valueOf(1);
            for (BigInteger bi = result; bi.compareTo(BigInteger.valueOf(number)) <= 0; bi = bi.add(BigInteger.valueOf(1))) {
                result = result.multiply(bi);
            }
            return result;
        } else {
            BigInteger res = BigInteger.valueOf(0);
            return res;
        }
    }

}

