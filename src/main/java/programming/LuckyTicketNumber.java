package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 12/26/2017.
 */
public class LuckyTicketNumber {

    static String onceInATram(int x) {
        int result = 0;
        // Complete this function
        do {
            int firstHalf = x / 1000;
            int secondHalf = x % 1000;
            int totalOfFirstHalf = 0;
            int totalOfSecondHalf = 0;


            while (firstHalf != 0) {
                totalOfFirstHalf += firstHalf % 10;
                firstHalf = firstHalf / 10;
            }
            while (secondHalf != 0) {
                totalOfSecondHalf += secondHalf % 10;
                secondHalf = secondHalf / 10;
            }

            if (totalOfFirstHalf == totalOfSecondHalf) {
                result = x;
                x = 0;
            } else {
                x += 1;
            }

        } while (x != 0);
        return Integer.toString(result);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
