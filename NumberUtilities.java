
import java.lang.StringBuffer;
import java.lang.Math;

public class NumberUtilities {

    public static String getRange(int stop) {
        
        StringBuffer outcome = new StringBuffer();
        for (int i = 0; i < stop; i++) {
            outcome.append(i);
        }
        return outcome.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuffer outcome = new StringBuffer();
        for (int i = start; i < stop; i++) {
            outcome.append(i);
        }
        return outcome.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuffer outcome = new StringBuffer();
        for (int i = start; i < stop; i = i + step) {
            outcome.append(i);
        }
        return outcome.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuffer outcome = new StringBuffer();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
            outcome.append(i);
        }
    }
    return outcome.toString();
}


    public static String getOddNumbers(int start, int stop) {
        StringBuffer outcome = new StringBuffer();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
            outcome.append(i);
        }
    }
    return outcome.toString();
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuffer outcome = new StringBuffer();
        for (int i = start; i <= stop; i++) {
            outcome.append((int)Math.pow(i, exponent));
        }
        return outcome.toString();
    }
    
    }

