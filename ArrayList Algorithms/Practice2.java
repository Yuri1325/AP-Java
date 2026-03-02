public class Practice2 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        System.out.println(getAverageOfRows(nums));
    }

    /**
     * 
     * @param arr any 2d array of ints
     * @return returns the average of the sum of the rows
     */
    public static double getAverageOfRows(int[][] arr) {
        int counter = 0;
        int sum = 0;
        for (int[] row : arr) {

            for (int num : row)
                sum += num;
            counter++;
        }
        double avg = (double) sum / counter;
        return avg;
    }
}
