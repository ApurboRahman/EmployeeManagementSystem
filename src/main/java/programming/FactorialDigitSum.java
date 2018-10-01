package programming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/17/2017.
 * <p>
 * Project Euler #20: Factorial digit sum
 */
public class FactorialDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            System.out.println(sumOfFactoralDigit(factorial(input)));
        }

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int sumOfFactoralDigit(int sumOfFactoral) {
        int sum = 0;
        while (sumOfFactoral > 0) {
            int reminder = sumOfFactoral % 10;
            sum += reminder;
            sumOfFactoral = sumOfFactoral / 10;
        }
        return sum;
    }
}



/*
 static BigInteger div = new BigInteger("10");
    static BigInteger reminder;
    static BigInteger fact;

    static BigInteger total = BigInteger.ZERO;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger();


        System.out.println(factorial(number));
    }

    static BigInteger factorial(BigInteger n) {

        if (BigInteger.ONE.equals(n)) {

            return BigInteger.ONE;
        } else {


            return factTotal(n.multiply(factorial(n.subtract(BigInteger.ONE))));

        }
    }

    static BigInteger factTotal(BigInteger n) {
        while (!n.equals(BigInteger.ZERO)){
            reminder = n.mod(div);
            total = total.add(reminder);
            n = n.divide(div);
        }

        return total;
    }
 */