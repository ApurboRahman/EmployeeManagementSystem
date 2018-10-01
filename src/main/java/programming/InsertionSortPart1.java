package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/7/2017.
 */
public class InsertionSortPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        insertIntoSortedList(array,n);

    }

    public static void insertIntoSortedList(int[] arr, int length) {
        int tempData, tempPosition;
        for (int j = 1; j < length; j++) {
            tempData = arr[j];
            tempPosition = j - 1;
            while (tempPosition >= 0 && arr[tempPosition] > tempData) {
                arr[tempPosition + 1] = arr[tempPosition];
                tempPosition--;
                printArray(arr);
            }
            arr[tempPosition + 1] = tempData;
        }
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

}
