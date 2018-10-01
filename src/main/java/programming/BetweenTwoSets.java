package programming;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/6/2017.
 */
public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        int min = a[0];
        int max = b[b.length - 1];
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (hasFactor(i, a) && isFactor(i, b)) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static boolean hasFactor(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if ((a%arr[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFactor(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % a) != 0) {
                return false;
            }
        }
        return true;
    }
}
