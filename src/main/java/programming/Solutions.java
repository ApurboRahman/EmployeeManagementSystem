package programming;

import java.util.Scanner;

/**
 * Created by Apurbo on 10/31/2016.
 */
public class Solutions {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }
}
