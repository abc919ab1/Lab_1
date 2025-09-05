public class NrDiff {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 15};
        

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // print out the difference between max and min values

        System.out.println("Difference = " + (max - min));
    }

}