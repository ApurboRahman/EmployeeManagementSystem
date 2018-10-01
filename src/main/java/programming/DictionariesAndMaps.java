package programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Apurbo on 10/26/2016.
 */
public class DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,phone);

        }

        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.get(s)==null){
                System.out.println("Not found");
            }else {
                System.out.println(s +"="+phoneBook.get(s));
            }
            // Write code here
        }
        in.close();
    }
}
