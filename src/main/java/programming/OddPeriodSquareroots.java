package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/27/2017.
 * Project Euler #64: Odd period square roots
 */
public class OddPeriodSquareroots {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int upperbound = sc.nextInt();
        int result = 0;

        for (int n = 2; n <= upperbound; n++) {
            int limit = (int) Math.sqrt(n);
            if (limit * limit == n) continue;

            int period = 0;
            int d = 1;
            int m = 0;
            int a = limit;

            do{
                m = d*a - m;
                d = (n - m * m) / d;
                a = (limit + m) / d;
                period++;
            }while(a != 2*limit);

            if (period % 2 == 1) result++;
        }

        System.out.println(result);


    }
}
