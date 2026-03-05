public class Practice3 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        System.out.println(getAverageOfMins(nums));
    }

    /**
     * 
     * @param arr2d -> any 2d array ->{@code int[][]}
     * @return -> returns the average of each minimun value of each row ->
     *         {@link Double}
     */
    public static double getAverageOfMins(int[][] arr2d) {
        int sum = 0;
        int counter = 0;
        for (int[] row : arr2d) {
            int min = Integer.MAX_VALUE;
            for (int num : row) {
                min = (num < min) ? num : min;

            }
            sum += min;
            counter++;
        }
        double avg = (double) sum / counter;
        return avg;
    }

    public static int getNumDupelicateRows(String[][] arr)
        {
            for(int i = 0;i<arr.lenght;)
        }
}
