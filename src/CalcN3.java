import java.util.ArrayList;

public class CalcN3 {
    public static void Calc(int[] input, int min, int max) {
        int maxSteps = 0;
        int[] longestInput = new int[4];
        for (int i = min; i < max; i++) {
            for (int j = min; j < max; j++) {
                for (int k = min; k < max; k++) {

                    input = new int[]{i,j,k};
                    ArrayList<int[]> series = new ArrayList<int[]>();

                    int step = 0;
                    int[] array = input;

                    while (true) {
                        series.add(array);
                        array = Utils.calcStep(array);
                        step++;

                        boolean isZero = true;
                        for (int num : array) {
                            if (num != 0) isZero = false;
                        }

                        if (isZero) break;
                        if (Utils.containsArray(series, array)) break;
                    }

                    if (step > maxSteps) {
                        maxSteps = step;
                        longestInput = input;
                    }
                }
            }
        }

        Utils.printArray(longestInput);
        System.out.println(maxSteps);
    }
}
