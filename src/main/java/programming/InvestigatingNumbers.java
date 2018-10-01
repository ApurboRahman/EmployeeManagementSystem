package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/8/2017.
 */
public class InvestigatingNumbers {
    static int min = 1;
    static int max = 9;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        Integer m = scanner.nextInt();
        Integer t = scanner.nextInt();
        int p = 9;


        int[] kList = new int[t];
        ArrayList maxList = new ArrayList();
        ArrayList minList = new ArrayList();
        for (int i = 0; i < t; i++) {
            int k1 = scanner.nextInt();
            kList[i] = k1;
        }
        for (int i = 0; i < kList.length; i++) {
            for (int j = 1; j < kList[i]; j++) {
                max = max * 10 + 9;

            }
            maxList.add(max);

            max=9;

            for (int n = 1; n < kList[i]; n++) {
                min = min * 10;
            }
            minList.add(min);
            min=1;
        }

        for (int i =0; i<t;i++){
            int count = 0;
            for (int j = (int) minList.get(i); j<=(int)maxList.get(i); j++){
                count++;
            }
            if (kList[i]>m){
                int diff = kList[i]-m;
                diff = diff*9;
                count = count-diff;
                System.out.println(count);
            }else {
                System.out.println(count);
            }

        }


        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }
    public List makeSingleDigit(int number){
        List list = new ArrayList();
        while(number!=0){
            int reminder = number%10;
            list.add(reminder);
            number = number/10;
        }
        return list;
    }

}
