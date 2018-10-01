package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 10/24/2016.
 */
public class StringSeparato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String sEven = "";
        String sOdd = "";

        String str = sc.nextLine();
        for (int a = 0; a < input; a++) {
             str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char[] arr = new char[str.length()];
                arr[i] = str.charAt(i);
                char c = arr[i];

                if (i % 2 == 0) {

                    sEven = sEven.concat(String.valueOf(c));

                } else {
                    sOdd = sOdd.concat(String.valueOf(c));
                }
            }
            System.out.println(sEven + " " + sOdd);
            sEven="";
            sOdd="";
        }


    }
}
