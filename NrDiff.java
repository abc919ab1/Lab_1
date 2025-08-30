public class NrDiff {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 10};

        int min = 1;
        int max = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Difference = " + (max - min)); // 9
    }
}
