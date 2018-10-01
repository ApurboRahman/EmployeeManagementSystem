package programming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/5/2017.
 */
public class ReformatTheDate {
    static String[] reformatDate(String[] dates)  {
        for(int i = 0; i<dates.length;i++){
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date = null;
            try {
                date = formatter.parse(dates[i]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dates[i]= date.toString();
        }

        return dates;
    }
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;

        int _dates_size = 0;
        _dates_size = Integer.parseInt(in.nextLine().trim());
        String[] _dates = new String[_dates_size];
        String _dates_item;
        for(int _dates_i = 0; _dates_i < _dates_size; _dates_i++) {
            try {
                _dates_item = in.nextLine();
            } catch (Exception e) {
                _dates_item = null;
            }
            _dates[_dates_i] = _dates_item;
        }

        res = reformatDate(_dates);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
