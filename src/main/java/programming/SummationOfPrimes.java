package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/13/2017.
 */
public class SummationOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long input = scanner.nextInt();
            System.out.println(sumationOfPrime(input));
        }
    }

    static long sumationOfPrime(long number) {
        long i = 0;
        long num = 0;
        long primeNumbers = 0;
        for (i = 1; i <= number; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i;
            }
        }
        return primeNumbers;
    }
}
