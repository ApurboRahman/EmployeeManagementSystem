package programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Apurbo on 10/27/2016.
 */
public class UnfairnessEquals {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int K = Integer.parseInt(in.readLine());
        int[] list = new int[N];

        for (int i = 0; i < N; i++)
            list[i] = Integer.parseInt(in.readLine());

        int unfairness = Integer.MAX_VALUE;
        Arrays.sort(list);

        for (int i = 0; i <= N-K ; i++) {
            int p = list[i + K - 1] - list[i];
            {
                if (unfairness > p) {
                    unfairness = p;
                }
            }
        }
      /*
       * Write your code here, to process numPackets N, numKids K, and the packets of candies
       * Compute the ideal value for unfairness over here
      */

        System.out.println(unfairness);
    }
}
