package programming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by Apurbo on 11/1/2016.
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;

    }

    public void computeDifference() {
        int diff = elements.length;
        Arrays.sort(elements);
        maximumDifference = elements[diff-1]-elements[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
