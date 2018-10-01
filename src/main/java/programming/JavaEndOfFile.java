package programming;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Apurbo on 10/23/2016.
 */
public class JavaEndOfFile {

    public static void main(String[] args) throws NoSuchElementException{
        Scanner sc = new Scanner(System.in);
        Integer count = 1;
        String line = sc.nextLine();

        while (!line.isEmpty()) {
            System.out.println(count + " " + line);
            count++;
            line = sc.nextLine();
        }
    }
}
