package programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Apurbo on 1/29/2017.
 */
public class MakeCylinderEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.nextLine());
        Integer b = Integer.parseInt(scanner.nextLine());
        Integer c = Integer.parseInt(scanner.nextLine());

        System.out.println(a + ", " + b + ", " + c);
        List<Integer> cylinderOne = new ArrayList<>();
        List<Integer> cylinderTwo = new ArrayList<>();
        List<Integer> cylinderThree = new ArrayList<>();

        Integer totalHeightOfCylinderOne = 0, totalHeightOfCylinderTwo=0, totalHeightOfCylinderThree=0;
        for (int i = 0; i < a; i++) {
            Integer d = Integer.parseInt(scanner.nextLine());
            cylinderOne.add(d);
            totalHeightOfCylinderOne += d;
        }

        for (int i = 0; i < b; i++) {
            Integer d = Integer.parseInt(scanner.nextLine());
            cylinderTwo.add(d);
            totalHeightOfCylinderTwo += d;
        }

        for (int i = 0; i < c; i++) {
            Integer d = Integer.parseInt(scanner.nextLine());
            cylinderThree.add(d);
            totalHeightOfCylinderThree += d;
        }
        scanner.close();
        System.out.println(totalHeightOfCylinderOne + ", " + totalHeightOfCylinderTwo + ", " + totalHeightOfCylinderThree);
        equalCylinder(cylinderOne,cylinderTwo,cylinderThree,totalHeightOfCylinderOne,totalHeightOfCylinderTwo,totalHeightOfCylinderThree);
    }

    public static void equalCylinder(List<Integer> C1, List<Integer> C2, List<Integer> C3,Integer T1, Integer T2, Integer T3){
        if (T1 == T2 && T2 == T3){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
            makeEqual(C1,C2,C3,T1,T2,T3);

        }
    }
    public static void makeEqual(List<Integer> C1, List<Integer> C2, List<Integer> C3,Integer T1, Integer T2, Integer T3){
        if (T1>T2 && T1>T3){
            T1 = T1 - C1.remove(0);
            equalCylinder(C1,C2,C3,T1,T2,T3);
        }
        if (T2>T1 && T2>T3){
            T2 = T2 - C2.remove(0);
            equalCylinder(C1,C2,C3,T1,T2,T3);
        }

        if (T3>T1 && T3>T2){
            T3 = T3 - C3.remove(0);
            equalCylinder(C1,C2,C3,T1,T2,T3);
        }
    }
    public static void checkTwoEqual(List<Integer> C1, List<Integer> C2, List<Integer> C3,Integer T1, Integer T2, Integer T3){
        if (T1>T2){

        }
    }
}
