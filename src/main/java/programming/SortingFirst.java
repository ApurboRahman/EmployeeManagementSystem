package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/7/2017.
 */
public class SortingFirst {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int list = sc.nextInt();
        int [] array = new int[1000];
        for(int i = 0; i<list;i++){
        array[i] = sc.nextInt();
            if(array[i]==value){
                System.out.println(i);
            }
        }
    }
}
