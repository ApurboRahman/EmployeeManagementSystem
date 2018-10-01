package programming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/14/2017.
 */
public class LargeSum {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        scan.nextLine();
        // using BigInteger : Initializing at 0
        BigInteger sum = new BigInteger("0");
        String temp;
        for(int x=0;x<length;x++){
            temp = scan.nextLine();
            BigInteger tempInt = new BigInteger(temp);
            sum = sum.add(tempInt);
        }
        String testString =  sum + "";
        System.out.println(testString.substring(0,10));
    }
}
