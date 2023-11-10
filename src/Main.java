import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    static int[] input = {1,3,5,9};
    static int max = 100;
    static int min = 0;
    final static int[] zeroArr = {0,0,0,0};

    public static void main(String[] args) {
        int maxN = 0;
        int[] longestInput = new int[4];
        for (int i = min; i < max; i++) {
            for (int j = min; j < max; j++) {
                for (int k = min; k < max; k++) {
                    for (int l = min; l < max; l++) {
                        input = new int[]{i,j,k,l};

                        int n = 0;
                        int[] array = input;

                        while (true) {
                            array = calcStep(array);
                            n++;
                            if (Arrays.equals(array, zeroArr)) break;
                        }

                        if (n > maxN) {
                            maxN = n;
                            longestInput = input;
                        }
                    }
                }
            }
        }

        printArray(longestInput);
        System.out.println(maxN);
    }

    // Prints the array
    static void printArray(int[] array) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int num : array) {
            joiner.add(Integer.toString(num));
        }

        System.out.println(joiner.toString());
    }

    // Calculates each step
    static int[] calcStep(int[] input) {
        int[] array = copyArray(input);

        for (int i = 0; i < input.length; i++) {
            int nextIndex = i+1;
            if (nextIndex >= input.length) nextIndex = 0;
            array[i] = Math.abs(input[i] - input[nextIndex]);
        }

        return array;
    }

    // Creates a new instance of the array
    static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}