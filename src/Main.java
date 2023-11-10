public class Main {
    static int[] input = {1,3,5,9};
    static int max = 101;
    static int min = 1;


    public static void main(String[] args) {
        System.out.println("Antwoord op vraag 2a:");
        CalcN3.Calc(input, min, max);
        System.out.println("Antwoord op vraag 2b:");
        CalcN4.Calc(input, min, max);
    }
}