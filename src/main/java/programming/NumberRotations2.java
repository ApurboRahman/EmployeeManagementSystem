package programming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/10/2017.
 */
public class NumberRotations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        long power = (long) Math.pow(10, m);
       System.out.println( getResut(power));
    }

    static long getResut(long power) {
        long sum = 0;
        for (int i = 10; i < power; i++) {
            long value = i;

            boolean isRotate = rotate(i);
            if (isRotate){
                sum += i;
            }
        }
        return sum;
    }

    static boolean rotate(int value) {
        boolean isEqual = false;
        String s = String.valueOf(value);
        char c = s.charAt(s.length() - 1);
        String subString = s.substring(0, s.length() - 1);
        subString = c + subString;

        int result = Integer.parseInt(subString);
        if (result % value == 0) {
            System.out.print(s+" ");
            isEqual = true;
        }
        return isEqual;
    }
}
