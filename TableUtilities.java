 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder outcome = new StringBuilder();
        int tableSize = 5;
        for (int i = 1; i <= tableSize; i++) {
          
            for (int j = 1; j <= tableSize; j++) {
                outcome.append(String.format("%3d |", i * j));
            }
            outcome.append('\n');
        }
        System.out.println(outcome.toString());
        return outcome.toString();
    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10;
        return getMultiplicationTable(tableSize);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder outcome = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
          
            for (int j = 1; j <= tableSize; j++) {
                outcome.append(String.format("%3d |", i * j));
            }
            outcome.append('\n');
        }
        System.out.println(outcome.toString());
        return outcome.toString();
    }
}
