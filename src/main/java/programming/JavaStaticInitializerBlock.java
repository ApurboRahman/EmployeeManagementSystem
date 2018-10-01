package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 10/23/2016.
 */

public class JavaStaticInitializerBlock {
    static Integer B;
    static Integer H;
    static Boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        try {
            if (B < 0 || H < 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }

        } catch (Exception e) {
            System.out.print(e);
        }


    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}
