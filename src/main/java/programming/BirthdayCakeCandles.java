package programming;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/10/2017.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int max =0,lastmax=0,count = 0;
        boolean flag =false;
        for(int i = 0; i<height.length;i++){
            if(height[i]>=max){
                lastmax = max;
                max =height[i];
                flag=true;
                if (lastmax!=max)
                    count=1;
                else if(flag)
                {
                    flag=false;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
