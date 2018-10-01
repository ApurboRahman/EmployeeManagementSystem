package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 10/19/2016.
 */
public class Kangaru {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        int dx = x1 - x2;
        int dv = v2 - v1;

        if(dv == 0) {
            System.out.println("NO");
        } else if((dx % dv == 0) && (dx / dv > 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
