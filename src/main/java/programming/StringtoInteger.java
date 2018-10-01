package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 11/5/2016.
 */
public class StringtoInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        try {
            Integer ins = Integer.parseInt(st);
            System.out.println(ins);

        } catch (NumberFormatException n) {
            System.out.println("Bad String");

        }

    }
}
