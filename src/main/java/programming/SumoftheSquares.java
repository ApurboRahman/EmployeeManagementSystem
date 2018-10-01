package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/9/2017.
 */
public class SumoftheSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long  sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += perfectNumber(i);

        }
        System.out.println(sum);
    }

    static long perfectNumber(long n) {
        long  p = n;
        long  sum = 0;
        while (p != 0) {
            long  reminder = p % 10;
            reminder = reminder * reminder;
            sum = reminder + sum;
            p = p / 10;

        }
        long sqrt = (long) Math.sqrt(sum);
        if (sqrt * sqrt == sum) {
            return n;
        }
        return 0;
    }
}
