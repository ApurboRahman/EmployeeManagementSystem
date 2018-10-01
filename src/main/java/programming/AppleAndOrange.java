package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 2/6/2017.
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int toatalApple = 0;
        int totalOrange = 0;

        for(int i = 0; i<apple.length;i++){
            int distance = a+apple[i];
            if(distance>=s && distance<=t){
                toatalApple++;
            }
        }
        for(int i = 0; i<orange.length;i++){
            int distance = b+orange[i];
            if(distance>=s && distance<=t){
                totalOrange++;
            }
        }
        System.out.println(toatalApple);
        System.out.println(totalOrange);
    }

}
