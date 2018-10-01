package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/13/2017.
 */
public class SmallestMultiple {
    public static void main(String[] args) {
        long[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long input = scanner.nextInt();
            long result = 1;
            for (int j = 0; j < primes.length; j++) {
                long tempResult = 1;
                while (tempResult * primes[j] <= input) {
                    tempResult *= primes[j];
                    result *= primes[j];
                }
            }
            System.out.println(result);
        }

    }
}
