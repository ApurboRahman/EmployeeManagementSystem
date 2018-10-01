package programming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/10/2017.
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            System.out.println(findLargestPrimeFactor(n));
        }
    }

    static long makeDivide(long n, long k) {
        while (n % k == 0) {
            n = n / k;
        }
        return n;
    }

    static long findLargestPrimeFactor(long n) {
        long k = 2;
        while (k <= Math.floor(Math.sqrt(n))) {
            n = makeDivide(n, k);
            if (n == 1)
                return k;
            k++;
        }
        return n;
    }


}
