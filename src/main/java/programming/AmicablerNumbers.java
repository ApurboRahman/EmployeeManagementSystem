package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/18/2017.
 */
public class AmicablerNumbers {
    public static void main(String[] args) {
       // long firstTime =  System.currentTimeMillis();
        int sumA = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        List<Integer> listOfSum = new ArrayList();
        List<Integer> listOfNumber = new ArrayList();
        for (int i = 0; i < input; i++) {
            int number = scanner.nextInt();
            for (int m = 1; m <= number; m++) {
                for (int j = 1; j <= m / 2; j++) {
                    if (m % j == 0) {
                        sumA += j;
                    }
                }
                listOfNumber.add(m);
                listOfSum.add(sumA);
                // System.out.println(a+" "+sumA);
                sumA = 0;
            }
            sumOfAmicalbeNumber(listOfNumber,listOfSum);
            listOfNumber.clear();
            listOfSum.clear();
        }
      //  long lastTime =  System.currentTimeMillis();
      //  System.out.println((lastTime-firstTime)/1000);
    }
    static void sumOfAmicalbeNumber(List<Integer> numbersList, List<Integer> sumList){
        int totalSum = 0;
        for (int s = 0; s < numbersList.size(); s++) {
            for (int k = 0; k < sumList.size(); k++) {
                if (numbersList.get(s).equals(sumList.get(k)) && numbersList.get(k).equals(sumList.get(s))) {
                    int first = numbersList.get(s);
                    int last = sumList.get(s);
                    if (first < last) {
                        // System.out.println(listOfNumber.get(s)+"  "+listOfSum.get(s));
                        int sum = first + last;
                        totalSum += sum;

                    }

                }

            }
        }
        System.out.println(totalSum);

    }

}
