 import java.lang.StringBuilder;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder outcome = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            outcome.append("*");
        }
        return outcome.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder outcome = new StringBuilder();
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                outcome.append("*");
            }
            outcome.append('\n');
        }
        return outcome.toString();
    }


    public static String getSmallTriangle() {
        int rows = 4;
        return getTriangle(rows);
    }

    public static String getLargeTriangle() {
        int rows = 9;
        return getTriangle(rows);
    }
}
