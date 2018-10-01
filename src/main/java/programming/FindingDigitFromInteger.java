package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/9/2017.
 */
public class FindingDigitFromInteger {
    static int min = 1;
    static int max = 9;

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int newNumber = 0;
        int count = 0;
        List list = new ArrayList();
        while(n!=0){
            int reminder = n%10;
            list.add(reminder);
            n = n/10;
        }
        int j = 1;

        for(int i = 1; i<=list.size();i++){
            if(list.size()==j) break;
            if(list.get(i-1) == list.get(j)){
                newNumber = Math.addExact(10*newNumber , (Integer)list.get(i-1));
                count++;
            }else{
                j = i+1;
            }
        }
        if(count ==3){
            System.out.println(count);
            System.out.println(newNumber);
        }else{
            System.out.println(0);
        }

    }
}
