public class MinMaxCalculation {

    public static int[] findMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        return new int[] { min, max };
    }

    public static void main(String[] args) {
        int[] numbers = { 42, 23, 64, 12, 78, 54, 9, 33 };
        
        int[] minMax = findMinMax(numbers);
        
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }
}
