package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/11/2017.
 */
public class SumSquareDifference {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n;i++){
            long p = scanner.nextLong();
            System.out.println(findDifference(p));
        }
    }
    static long findSumOfSquare(long n){
        return (long) ((Math.pow(n,2)*Math.pow(n+1,2)))/4;
    }

    static long findSquqareOfSum(long n){
        return (n*(n+1)*(2*n+1))/6;
    }

    static long findDifference(long number){
        return findSumOfSquare(number)-findSquqareOfSum(number);
    }
}
