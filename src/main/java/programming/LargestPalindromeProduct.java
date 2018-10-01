package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/12/2017.
 */
public class LargestPalindromeProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getPalandrom(n));
/*        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            System.out.println(getPalandrom(input));
        }*/
    }



    static long getPalandrom(long input) {
        long number = 0, palandarom = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                number = i * j;
                palandarom = findPalandrome(number);
                if (number == palandarom && number < input) {
                    palandarom = number;
                }
            }
        }
        return palandarom;
    }
    static long findPalandrome(long number) {
        long palandrome = 0;
        long n = number;
        while (n != 0) {
            palandrome = palandrome * 10;
            palandrome += n % 10;
            n = n / 10;
        }
        return palandrome;
    }


}
