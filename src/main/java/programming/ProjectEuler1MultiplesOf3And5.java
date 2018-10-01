package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/10/2017.
 */
public class ProjectEuler1MultiplesOf3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println(findTotals(t));

/*        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(findTotals(n));
        }*/

    }

    static long findTotals(int t) {
        long sum = 0;
        for (int i = 1; i < t; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
