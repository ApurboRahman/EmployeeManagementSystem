package programming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Apurbo on 2/5/2017.
 */
public class BracesBalanced {
    static String[] braces(String[] values) {

        return new String[]{"yes"};

    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;

        int _values_size = 0;
        _values_size = Integer.parseInt(in.nextLine().trim());
        String[] _values = new String[_values_size];
        String _values_item;
        for (int _values_i = 0; _values_i < _values_size; _values_i++) {
            try {
                _values_item = in.nextLine();
            } catch (Exception e) {
                _values_item = null;
            }
            _values[_values_i] = _values_item;
        }

        res = braces(_values);
        for (int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
