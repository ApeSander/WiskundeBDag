import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Utils {
    // Prints an array
    public static void printArray(int[] array) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int num : array) {
            joiner.add(Integer.toString(num));
        }

        System.out.println(joiner.toString());
    }

    // Calculates each step
    public static int[] calcStep(int[] input) {
        int[] array = copyArray(input);

        for (int i = 0; i < input.length; i++) {
            int nextIndex = i+1;
            if (nextIndex >= input.length) nextIndex = 0;
            array[i] = Math.abs(input[i] - input[nextIndex]);
        }

        return array;
    }

    // Creates a new instance of the array
    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Checks if arraylist contains a specific integer array
    public static boolean containsArray(ArrayList<int[]> arrayList, int[] arrayToFind) {
        for (int[] array : arrayList) {
            if (Arrays.equals(array, arrayToFind)) return true;
        }

        return false;
    }
}
