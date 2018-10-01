package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 10/19/2016.
 */
public class Piramid {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
       /* sc.close();
        for (int a = 1; a <= n; a++) {
            for(int c = n-1;c>=a;c--){
                System.out.print(" ");
            }
            for (int  b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

       double tip =  mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        double totalCost = mealCost + tip + tax;
        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        totalCost = (int) Math.round(totalCost);
        System.out.println(totalCost);
    }
}
