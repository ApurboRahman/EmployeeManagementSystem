package programming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/17/2017.
 */
public class PowerDigitSum {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger base = new BigInteger("2");
        BigInteger div =new BigInteger("10");
        BigInteger sum = BigInteger.ZERO;
        BigInteger total;
        BigInteger reminder;
        int intput = scanner.nextInt();
        for(int i = 0; i<intput;i++){
           int powerDigit = scanner.nextInt();
            total = BigInteger.ZERO;
            sum = base.pow(powerDigit);

            while (!BigInteger.ZERO.equals(sum)){
                reminder = sum.mod(div);
                total = total.add(reminder);
                sum = sum.divide(div);
            }
            System.out.println(total);
        }

    }



}
