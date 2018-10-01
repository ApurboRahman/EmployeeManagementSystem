package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/10/2017.
 */
public class EvenFibonacciNumbers {

    static long MAX_N = 40000000000000000l; //4 * 10 ^ 6
    static List<Long> e = new ArrayList<>();
    static List<Long> sum = new ArrayList<>();

    public static void main(String[] args) {
        caculate();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println(result(scanner.nextLong()));
        for (int i = 0; i < t; i++) {
            System.out.println(result(scanner.nextLong()));
        }

        scanner.close();
    }

    static void caculate() {
        e.add(2l);
        e.add(8l);
        sum.add(2l);
        sum.add(10l);

        while (e.get(e.size() - 1) <= MAX_N) {
            long tmp = 4 * e.get(e.size() - 1) + e.get(e.size() - 2);
            e.add(tmp);
            sum.add(tmp + sum.get(sum.size() - 1));
        }
    }

    static long result(long n) {
        for (int i = e.size() - 1; i >= 0; i--) {
            if (e.get(i) <= n)
                return sum.get(i);
        }
        return 0;
    }
}
