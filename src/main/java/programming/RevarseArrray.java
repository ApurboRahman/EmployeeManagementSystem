package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 10/25/2016.
 */
public class RevarseArrray {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
    }
    in.close();


    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;

    }
    for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");

    System.out.println();
}
}
