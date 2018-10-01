package programming;

/**
 * Created by Apurbo on 10/31/2016.
 */
abstract class Book
{
    String title;
    String author;

    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}