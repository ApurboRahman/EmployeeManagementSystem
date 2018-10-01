package programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Apurbo on 10/15/2016.
 */
public class TimeCounting {

    static Integer minute = 60;
    static Integer hour = 60;
    static Integer day = 24;
    static Integer month = 30;
    static Integer year = 12;

    public static void main(String[] args) throws IOException {
        System.out.print("Input Seconds");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(br.readLine());
        TimeCounting timeCounting = new TimeCounting();
        if (input < 1) {
            System.out.println("");
        } else if (input == 1) {
            System.out.println(1 + " Second\n");
        } else if (input > 1) {
            Integer min = input / minute;
            timeCounting.minuteCalculation(input);

        }
    }

    private void minuteCalculation(Integer sec) {
        Integer min = sec / minute;
        sec = sec % minute;
        hourCalculation(min);
        System.out.println(sec + " Seconds\n");
        System.out.println(min + " Minutes");
    }

    private void hourCalculation(Integer mints) {
        if (mints == 0) {
            System.out.println();
        } else if (mints > 59) {
            Integer hr = mints / hour;
            mints = mints % hour;
            dayCalculation(hr);
        }
    }

    private void dayCalculation(Integer hrs) {
        if (hrs==0){
            System.out.println();
        }else if(hrs==1){
            System.out.println(1 +" Day");
        }else if (hrs<23){
            Integer days = hrs/day;
            monthCalculation(days);
        }
    }

    private void monthCalculation(Integer days) {
        if (days==0){
            System.out.println();
        }else if(days==1){
            System.out.println(1 +" Day");
        }else if (days<12){
            Integer mnth = days/month;
            yearCalculation(mnth);
        }
    }


    private void yearCalculation(Integer mnth) {
        if (mnth==0){
            System.out.println();
        }else if(mnth==1){
            System.out.println(1 +" Month");
        }else if (mnth<12){
            Integer yr = mnth/year;
            System.out.println();
        }
    }

}
