package programming;

/**
 * Created by Apurbo on 10/30/2016.
 */
public class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int identification,int [] test) {
        super(firstName, lastName, identification);
        this.testScores = test;
    }



    public char calculate( ) {

        char c = 'F';
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {

            sum += testScores[i];

        }
        avg = sum / testScores.length;
        if (avg >= 90 && avg <= 100) {
            c = 'O';
        } else if (avg >= 80 && avg < 90) {
            c = 'E';
        } else if (avg >= 70 && avg < 80) {
            c = 'A';
        } else if (avg >= 55 && avg < 70) {
            c = 'P';
        } else if (avg >= 40 && avg < 55) {
            c = 'D';
        } else {
            c = 'T';
        }

        return c;
    }
}
