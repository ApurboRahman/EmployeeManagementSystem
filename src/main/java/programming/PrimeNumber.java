package programming;


import java.util.Scanner;


/**
 * Created by Apurbo on 11/14/2016.
 */
public class PrimeNumber {

    public static String testPrime(int n){
        if(n == 2){
            return "Prime";
        }else if(n==1){
            return "Not prime";
        }
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n%i == 0){
                return "Not prime";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) {

        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t;
        for(int i=0;i<n;i++){
            t = sc.nextInt();
            System.out.println(testPrime(t));
        }
    }
}
