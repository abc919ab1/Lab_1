public class NrDiff {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 15};

        int min = 1;
        int max = 1;

        // the loop start by checking second position of array (5) which is bigger than max value (1), thus saving 5 to max, then continuing loop.

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // print out the difference between max and min values

        System.out.println("Difference = " + (max - min)); // 9
    }
}
