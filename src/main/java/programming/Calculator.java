package programming;

/**
 * Created by Apurbo on 11/5/2016.
 */
public class Calculator {
    public int power(int n, int p){
        if(n<0 || p<0){
            throw new NumberFormatException("n and p should be non-negative");
        }else

        return (int) Math.pow(n,p);
    }
}
