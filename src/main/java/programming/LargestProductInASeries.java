package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/14/2017.
 */
public class LargestProductInASeries {
    public static void main(String[] args) throws NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
       // int n = scanner.nextInt();
        int mainStringLength = scanner.nextInt();
        int subStringLength = scanner.nextInt();
        String inputString = scanner.next();

        List subStringList = new ArrayList();
        for (int i = 0; i < mainStringLength; i++) {
            int endLength = i + subStringLength;
            int validLength = inputString.length() - i;
            if (validLength < i) {
                break;
            }
            String subString = inputString.substring(i, endLength);
            subStringList.add(subString);
            System.out.println(subString);
        }
        System.out.println(getMultipleList(subStringList));
/*        for (int m = 0; m < n; m++) {
            int mainStringLength = scanner.nextInt();
            int subStringLength = scanner.nextInt();
            String inputString = scanner.next();

            List subStringList = new ArrayList();
            for (int i = 0; i < mainStringLength; i++) {
                int endLength = i + subStringLength;
                int validLength = inputString.length() - i;
                if (validLength < i) {
                    break;
                }
                String subString = inputString.substring(i, endLength);
                subStringList.add(subString);
                //System.out.println(subString);
            }
            System.out.println(getMultipleList(subStringList));
        }*/
    }

    static long getMultipleList(List stringList) throws NoSuchElementException{
        List<Long> resultList = new ArrayList<>();
        long result = 1;
        for (int i = 0; i < stringList.size(); i++) {
            String newString = (String) stringList.get(i);
            for (int j = 0; j < newString.length(); j++) {
                int e = Integer.parseInt(String.valueOf(newString.charAt(j)));
                result *= e;
            }
            resultList.add(result);
            result = 1;
        }
        return getMaxResult(resultList);
    }

    static long getMaxResult(List<Long> resultList) throws NoSuchElementException{
        long total = 0;
        for (int i = 0; i < resultList.size(); i++) {
            long sum = resultList.get(i);
            if (sum > total) {
                total = sum;
            }
        }
        return total;
    }
}
