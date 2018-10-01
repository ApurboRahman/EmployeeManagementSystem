package programming;

/**
 * Created by Apurbo on 2/7/2017.
 */
public class MakeWatch {

    public static void main(String []args) throws InterruptedException {
        for(int i = 1; i<= 24;i++){
            for(int j = 0; j<60;j++){
                for(int k = 0; k<60;k++){
                System.out.print(" "+k);
                    Thread.sleep(1000);
                }
                System.out.print(" "+j);
            }
            System.out.print(" "+i);
        }
    }
}
