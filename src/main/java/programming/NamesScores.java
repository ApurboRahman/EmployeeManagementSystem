package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/20/2017.
 * <p>
 * Project Euler #22: Names scores
 */
public class NamesScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        List<String> stringList = new ArrayList();
        char[] scoreOfLeter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
       
        for (int m = 0; m < input; m++) {
            String nameString = scanner.next();
            stringList.add(nameString);
            findHeightScore(stringList, scoreOfLeter);
        }
       /* name = name.toLowerCase();
        int score = 0;
        for (int j = 1; j <= name.length(); j++) {
            for (int i = 1; i <= scoreOfLeter.length; i++) {
                if (name.charAt(j - 1) == scoreOfLeter[i - 1]) {
                    score += i;
                    System.out.println(name.charAt(j - 1) + " " + (i));
                    // System.out.println(score);
                    findHeightScore(stringList, scoreOfLeter);
                }
            }

        }
        System.out.println("length " + name.length());
        System.out.println("Score " + score);
        System.out.println(score * name.length());
    */
    }
    static void findHeightScore(List<String> nameList, char[] letterList) {
        for (int m = 0; m < nameList.size(); m++) {
            String name = nameList.get(m);
            name = name.toLowerCase();
            int score = 0;
            for (int j = 1; j <= name.length(); j++) {
                for (int i = 1; i <= letterList.length; i++) {
                    if (name.charAt(j - 1) == letterList[i - 1]) {
                        score += i;
                        System.out.println(name.charAt(j - 1) + " " + (i));
                        // System.out.println(score);

                    }
                }

            }
            System.out.println("length " + name.length());
            System.out.println("Score " + score);
            System.out.println(score * name.length());
        }
    }

}
