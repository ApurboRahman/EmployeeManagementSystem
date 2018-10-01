package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 1/9/2017.
 */
public class Lexicographically {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String A1 = A.substring(0,1).toUpperCase();
        String B1 = B.substring(0,1).toUpperCase();
        /* Enter your code here. Print output to STDOUT. */
        if(A.compareToIgnoreCase(B)>0){
            A = A1+A.substring(1);
            B = B1+B.substring(1);
            System.out.println("Yes");
            System.out.println(Math.addExact(A.length(),B.length()));
            System.out.println(A+" " +B);

        }else {
            A = A1+A.substring(1);
            B = B1+B.substring(1);
            System.out.println("No");
            System.out.println(Math.addExact(A.length(),B.length()));
            System.out.println(A+" " +B);
        }
    }
}
