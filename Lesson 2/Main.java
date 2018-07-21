import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Initialisation
        String[][] arg = new String[4][4];

        // Or
        // Testing of ArraySizeException
        // Uncomment this
        // String[][] arg = new String[5][5];

        // Random fill
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                arg[i][j] = Integer.toString(new Random().nextInt(9));
            }
        }

        // Testing of ArrayDataException
        // Uncomment this
        // arg[3][3] = "Wow, exception!";

        int result = 0;

        try {
            result = method(arg);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Oh, exception is success caught!");
        } finally {
            if (result != 0) System.out.println(result);
        }
    }

    // - Create method
    // - Name of method?
    // - ...method
    private static int method(String[][] strs) throws ArraySizeException, ArrayDataException {
        if (strs.length > 4 || strs[0].length > 4) throw new ArraySizeException();

        int sum = 0;

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length; j++) {
                try {
                    sum += Integer.parseInt(strs[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }

            }
        }

        return sum;
    }

    // Without "My" sounds better
    private static class ArraySizeException extends Exception {}
    private static class ArrayDataException extends Exception {
        ArrayDataException(int oneCell, int twoCell) {
            super("Error caused in String Array [" + oneCell + "][" + twoCell + "]");
        }
    }

}